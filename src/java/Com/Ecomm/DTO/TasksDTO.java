/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Ecomm.DTO;

import Com.Ecomm.Data.*;

public class TasksDTO  {
   
    private Integer taskID;
   
    private String name;
   
    private String class1;
   
    private String grade;
   
    private String taskdetails;
   
    private SubjectsDTO subject;
  
    private Teachers teacher;

    public TasksDTO(Tasks t) {
        taskID=t.getTaskID();
        name=t.getName();
        class1=t.getClass1();
        grade=t.getGrade();
        taskdetails=t.getTaskdetails();
        teacher=t.getTeacher();
        
        
    }

    public TasksDTO(Integer taskID) {
        this.taskID = taskID;
    }

    public Integer getTaskID() {
        return taskID;
    }

    public void setTaskID(Integer taskID) {
        this.taskID = taskID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTaskdetails() {
        return taskdetails;
    }

    public void setTaskdetails(String taskdetails) {
        this.taskdetails = taskdetails;
    }

    public SubjectsDTO getSubject() {
        return subject;
    }

    public void setSubjectID(SubjectsDTO subject) {
        this.subject = subject;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskID != null ? taskID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TasksDTO)) {
            return false;
        }
        TasksDTO other = (TasksDTO) object;
        if ((this.taskID == null && other.taskID != null) || (this.taskID != null && !this.taskID.equals(other.taskID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Com.Ecomm.Dataa.Tasks[ taskID=" + taskID + " ]";
    }
    
}
