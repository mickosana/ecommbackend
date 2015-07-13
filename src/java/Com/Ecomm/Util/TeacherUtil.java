/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Ecomm.Util;

import Com.Ecomm.DTO.ParentsDTO;
import Com.Ecomm.DTO.ReponseDTO;
import Com.Ecomm.DTO.StudentsDTO;
import Com.Ecomm.DTO.TasksDTO;
import Com.Ecomm.Data.Parents;
import Com.Ecomm.Data.Students;
import Com.Ecomm.Data.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class TeacherUtil {

    @PersistenceContext
    EntityManager em;
    Logger log = Logger.getLogger("teacher ejb");

    public ReponseDTO getAllStudents() {
        
        ReponseDTO resDTO = new ReponseDTO();
        Query q = em.createNamedQuery("Students.findAll", Students.class);
        List<Students> res = q.getResultList();
        List<StudentsDTO> dto = new ArrayList<StudentsDTO>();
        if (res.isEmpty()) {
            log.log(Level.OFF, "####THE DATABASE COULDNT FIND ANYTHING");

        } else {
            for (Students s : res) {
                dto.add(new StudentsDTO(s));
                log.log(Level.WARNING, "results returned:" + "name:" + s.getName() + "surname:" + s.getSurname() + "\n");
                  
            }
            resDTO.setStudents(dto);

        }
        return resDTO;
    }
   public ReponseDTO getAllParents(){
       ReponseDTO resDTO=new ReponseDTO();
       Query q=em.createNamedQuery("Parents.findAll", Parents.class);
       List<Parents>plist=q.getResultList();
       List<ParentsDTO>pDTO=new ArrayList<ParentsDTO>();
       for(Parents p:plist){
           pDTO.add(new ParentsDTO(p));
           
       
       resDTO.setParents(pDTO);
   }
       return resDTO;
}
   public ReponseDTO getStudentById(int studentID){
       ReponseDTO resDTO=new ReponseDTO();
       Query q=em.createNamedQuery("Students.findByStudentID",Students.class);
       q.setParameter("studentID",studentID);
       List<Students> st=q.getResultList();
      List<StudentsDTO>stDTO=new ArrayList<StudentsDTO>();
      if(st.isEmpty()){
             log.log(Level.OFF,"####the search for student:" + studentID + "returned nothing ###");
         
      }
         else{
             for(Students s:st){
                 stDTO.add(new StudentsDTO(s));
                 log.log(Level.OFF, "student: " +s.getName() +" " + s.getSurname() + "retrieved");
         }
             resDTO.setStudents(stDTO);
     }
       return resDTO;
   }
   public ReponseDTO getParentByID(int parentID){
       ReponseDTO resDTO=new ReponseDTO();
       Query q=em.createNamedQuery("Parents.findByParentID",Parents.class);
       q.setParameter("parentID",parentID);
       List<Parents>plist=q.getResultList();
       List<ParentsDTO>dtolist=new ArrayList<ParentsDTO>();
      
       for(Parents p:plist){
           dtolist.add(new ParentsDTO(p));
           log.log(Level.OFF, "parents found name: " + p.getName() + " " + p.getSurname());
       }
       resDTO.setParents(dtolist);
       return resDTO;
   }
  public ReponseDTO getTaskByID(int taskID){
      ReponseDTO resDTO =new ReponseDTO();
    Query q=em.createNamedQuery("Tasks.findByTaskID", Tasks.class);
    q.setParameter("taskID",taskID);
    List<Tasks>tlist=q.getResultList();
    List<TasksDTO>dtolist=new ArrayList<TasksDTO>();
    for(Tasks t:tlist){
        dtolist.add(new TasksDTO(t));
        log.log(Level.OFF,"returned : " + t.getName());
  }
  return resDTO;
}
}