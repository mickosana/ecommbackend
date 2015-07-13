/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Ecomm.Data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "tasks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tasks.findAll", query = "SELECT t FROM Tasks t"),
    @NamedQuery(name = "Tasks.findByTaskID", query = "SELECT t FROM Tasks t WHERE t.taskID = :taskID"),
    @NamedQuery(name = "Tasks.findByName", query = "SELECT t FROM Tasks t WHERE t.name = :name"),
    @NamedQuery(name = "Tasks.findByClass1", query = "SELECT t FROM Tasks t WHERE t.class1 = :class1"),
    @NamedQuery(name = "Tasks.findByGrade", query = "SELECT t FROM Tasks t WHERE t.grade = :grade"),
    @NamedQuery(name = "Tasks.findByTaskdetails", query = "SELECT t FROM Tasks t WHERE t.taskdetails = :taskdetails")})
public class Tasks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "taskID")
    private Integer taskID;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 45)
    @Column(name = "class")
    private String class1;
    @Size(max = 45)
    @Column(name = "grade")
    private String grade;
    @Size(max = 300)
    @Column(name = "taskdetails")
    private String taskdetails;
    @JoinColumn(name = "subjectID", referencedColumnName = "subjectID")
    @ManyToOne
    private Subjects subjectID;
    @JoinColumn(name = "teacher", referencedColumnName = "teacherID")
    @ManyToOne
    private Teachers teacher;

    public Tasks() {
    }

    public Tasks(Integer taskID) {
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

    public Subjects getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(Subjects subjectID) {
        this.subjectID = subjectID;
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
        if (!(object instanceof Tasks)) {
            return false;
        }
        Tasks other = (Tasks) object;
        if ((this.taskID == null && other.taskID != null) || (this.taskID != null && !this.taskID.equals(other.taskID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Com.Ecomm.Data.Tasks[ taskID=" + taskID + " ]";
    }
    
}
