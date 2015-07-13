/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Ecomm.DTO;

import Com.Ecomm.Data.*;

public class StudentsDTO  {
   
    private Integer studentID;
    
    private String name;
    
    private String surname;
   
    private String dob;
   
    private String clas;
    
    private Integer grade;
    
    private String gender;
   
    private int parent;
    
    private int school;

    public StudentsDTO(Students s) {
        studentID=s.getStudentID();
        name=s.getName();
        surname=s.getSurname();
        dob=s.getDob();
        clas=s.getClas();
        grade=s.getGrade();
        gender=s.getGender();
        parent=s.getParent().getParentID();
        school=s.getSchool().getSchoolID();
    }

    public StudentsDTO(Integer studentID) {
        this.studentID = studentID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

   
}
