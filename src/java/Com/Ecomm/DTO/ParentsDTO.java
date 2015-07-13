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

public class ParentsDTO {
    
   
    private Integer parentID;
  
    private String name;
   
    private String surname;
   
    private String occupation;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
   
    private String email;
   
    private Integer phonenumber;
   
    private List<StudentsDTO> studentsList;

    public ParentsDTO(Parents p) {
       parentID=p.getParentID();
       name=p.getName();
       surname=p.getSurname();
       occupation=p.getOccupation();
       email=p.getEmail();
       phonenumber=p.getPhonenumber();
       
               
       
    }

    public ParentsDTO(Integer parentID) {
        this.parentID = parentID;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    
    public List<StudentsDTO> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<StudentsDTO> studentsList) {
        this.studentsList = studentsList;
    }

    
}
