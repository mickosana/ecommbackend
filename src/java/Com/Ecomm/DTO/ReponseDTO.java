/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Ecomm.DTO;

import java.util.List;

/**
 *
 * @author CodeTribe1
 */
public class ReponseDTO {
  ParentsDTO parent;
  SchoolDTO school;
  StudentsDTO student;
  SubjectsDTO subject;
  TasksDTO task;
  TeachersDTO teacher;  
  private List<ParentsDTO> parents;
 private List<SchoolDTO>schools;
 private List<StudentsDTO>students;
 private List<SubjectsDTO>subjects;
 private List<TasksDTO>tasks;
 private List<TeachersDTO>teachers;

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

    public List<ParentsDTO> getParents() {
        return parents;
    }

    public void setParents(List<ParentsDTO> parents) {
        this.parents = parents;
    }

    public List<SchoolDTO> getSchools() {
        return schools;
    }

    public void setSchools(List<SchoolDTO> schools) {
        this.schools = schools;
    }

    public List<StudentsDTO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentsDTO> students) {
        this.students = students;
    }

    public List<SubjectsDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsDTO> subjects) {
        this.subjects = subjects;
    }

    public List<TasksDTO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TasksDTO> tasks) {
        this.tasks = tasks;
    }

    public List<TeachersDTO> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<TeachersDTO> teachers) {
        this.teachers = teachers;
    }
 
 
    
}
