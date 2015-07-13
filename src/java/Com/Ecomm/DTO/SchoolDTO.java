/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Ecomm.DTO;

import Com.Ecomm.Data.*;
import java.util.List;
/**
 *
 * @author CodeTribe1
 */
public class SchoolDTO  {
   
  
    private Integer schoolID;
 
    private String name;
   
    private String province;
    
    private List<TeachersDTO> teachersList;
   
    private List<StudentsDTO> studentsList;

    public SchoolDTO(School sch) {
        schoolID=sch.getSchoolID();
        name=sch.getName();
        province=sch.getProvince();
    }

    public SchoolDTO(Integer schoolID) {
        this.schoolID = schoolID;
    }

    public Integer getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(Integer schoolID) {
        this.schoolID = schoolID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    public List<TeachersDTO> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<TeachersDTO> teachersList) {
        this.teachersList = teachersList;
    }

  
    public List<StudentsDTO> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<StudentsDTO> studentsList) {
        this.studentsList = studentsList;
    }

   
  
    
}
