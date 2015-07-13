/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Ecomm.DTO;

/**
 *
 * @author CodeTribe1
 */
public class RequestDTO {
    int parentID,schoolID,studentID,subjectID,taskID,teacherID;
    ParentsDTO parent;  
    SchoolDTO school;
    StudentsDTO student;
    SubjectsDTO subject;
    TasksDTO task;
    TeachersDTO teacher;
    public static final int  GET_STUDENT_BY_ID=100;
    public static final int GET_SCHOOL_BY_ID=200;
    public static final int GET_PARENT_BY_ID=300;
    public static final int GET_SUBJECT_BY_ID=400;
    public static final int GET_TASK_BY_ID=500;
    public static final int GET_TEACHER_BY_ID=600;
    
    public static final int GET_STUDENTS=101;
    public static final int GET_PARENTS=301;
    public static final int GET_SCHOOLS=201;
    public static final int GET_SUBJECTS=401;
    public static final int GET_TASKS=501;
    public static final int  GET_TEACHERS=601;
    private int requestType;
    public static String getRequestType(int requestType){
       switch(requestType){
           case 100:
               return "GET_STUDENTS_BY_ID";
           case 101:
               return "GET_SCHOOL_BY_ID";
           case 200:
               return "GET_PARENT_BY_ID";
           case 201:
               return "GET_SCHOOLS";
               
           case 300:
               return "GET_SUBJECT_BY_ID";
           case 301:
               return "GET_SUBJECTS";
               
           case 400:
               return "GET_TASK_BY_ID";
           case 401:
               return "GET_TASKS";
           case 500:
               return "GET_TEACHER_BY_ID";
           
       }
       return "REQUEST UNKNOWN";
               
    }
    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public int getRequestType() {
        return requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public ParentsDTO getParent() {
        return parent;
    }

    public void setParent(ParentsDTO parent) {
        this.parent = parent;
    }

    public SchoolDTO getSchool() {
        return school;
    }

    public void setSchool(SchoolDTO school) {
        this.school = school;
    }

    public StudentsDTO getStudent() {
        return student;
    }

    public void setStudent(StudentsDTO student) {
        this.student = student;
    }

    public SubjectsDTO getSubject() {
        return subject;
    }

    public void setSubject(SubjectsDTO subject) {
        this.subject = subject;
    }

    public TasksDTO getTask() {
        return task;
    }

    public void setTask(TasksDTO task) {
        this.task = task;
    }

    public TeachersDTO getTeacher() {
        return teacher;
    }

    public void setTeacher(TeachersDTO teacher) {
        this.teacher = teacher;
    }
    
    
    
    
    
}
