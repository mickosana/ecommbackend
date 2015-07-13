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
public class SubjectsDTO {
    private Integer subjectID;
   
    private String name;
    
    private List<TasksDTO> tasksList;

    public SubjectsDTO() {
    }

    public SubjectsDTO(Integer subjectID) {
        this.subjectID = subjectID;
    }

    public Integer getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(Integer subjectID) {
        this.subjectID = subjectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public List<TasksDTO> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<TasksDTO> tasksList) {
        this.tasksList = tasksList;
    }

    
}
