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
public class TeachersDTO  {
   
    private Integer teacherID;
    
    private String name;
    
    private String surname;
   
    private SchoolDTO school;
   
    private List<TasksDTO> tasksList;

    public TeachersDTO() {
    }

    public TeachersDTO(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public SchoolDTO getSchool() {
        return school;
    }

    public void setSchool(SchoolDTO school) {
        this.school = school;
    }


    public List<TasksDTO> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<TasksDTO> tasksList) {
        this.tasksList = tasksList;
    }

   
}
