/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Ecomm.Servlet;
import Com.Ecomm.DTO.StudentsDTO;
import Com.Ecomm.DTO.ReponseDTO;
import Com.Ecomm.DTO.RequestDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Com.Ecomm.Util.TeacherUtil;
import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CodeTribe1
 */
public class TeacherServlet extends HttpServlet {
Logger log=Logger.getLogger("teacher servlet entered");
    @EJB
    TeacherUtil teacherutil;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("Application/json:charset=UTF-8");
        RequestDTO reqDTO =new RequestDTO();
        ReponseDTO resDTO =new ReponseDTO();
        try{
            reqDTO=getRequest(request);
            if(reqDTO==null||reqDTO.getRequestType()==0){
                log.log(Level.OFF,"an error was encountered the process...." );
                
                        
            }else{
                switch(reqDTO.getRequestType()){
                    case RequestDTO.GET_STUDENTS:
                        resDTO=teacherutil.getAllStudents();
                        break;
                    case RequestDTO.GET_PARENTS:
                        resDTO=teacherutil.getAllParents();
                        break;
                    case RequestDTO.GET_STUDENT_BY_ID:
                        resDTO=teacherutil.getStudentById(reqDTO.getStudentID());
                        break;
                    case RequestDTO.GET_PARENT_BY_ID:
                        resDTO=teacherutil.getParentByID(reqDTO.getParentID());
                        break;
                    case RequestDTO.GET_TASK_BY_ID:
                        resDTO=teacherutil.getTaskByID(reqDTO.getTaskID());
                        break;
                        
                       
                }
            }
            
            
        }catch(Exception e){
            log.log(Level.OFF, "encountered an error \n" + e.getMessage());
        }finally{
            Gson gson=new Gson();
            String json=gson.toJson(resDTO, ReponseDTO.class);
            response.setContentType("application/json;charset=UTF-8");
            PrintWriter out=response.getWriter();
            out.println(json);
            
        }
        
        
    }
public RequestDTO getRequest(HttpServletRequest request){
    RequestDTO reqDTO=new RequestDTO();
    String json=request.getParameter("JSON");
    Gson gson=new Gson();
    try{
        reqDTO=gson.fromJson(json, RequestDTO.class);
    }catch(Exception e){
        log.log(Level.OFF, "failed to pass json");
        reqDTO=new RequestDTO();
        reqDTO.getRequestType(0);
        
    }
    
    return reqDTO;
}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
