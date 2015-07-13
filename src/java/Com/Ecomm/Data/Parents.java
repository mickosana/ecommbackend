/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Ecomm.Data;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author CodeTribe1
 */
@Entity
@Table(name = "parents")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parents.findAll", query = "SELECT p FROM Parents p"),
    @NamedQuery(name = "Parents.findByParentID", query = "SELECT p FROM Parents p WHERE p.parentID = :parentID"),
    @NamedQuery(name = "Parents.findByName", query = "SELECT p FROM Parents p WHERE p.name = :name"),
    @NamedQuery(name = "Parents.findBySurname", query = "SELECT p FROM Parents p WHERE p.surname = :surname"),
    @NamedQuery(name = "Parents.findByOccupation", query = "SELECT p FROM Parents p WHERE p.occupation = :occupation"),
    @NamedQuery(name = "Parents.findByEmail", query = "SELECT p FROM Parents p WHERE p.email = :email"),
    @NamedQuery(name = "Parents.findByPhonenumber", query = "SELECT p FROM Parents p WHERE p.phonenumber = :phonenumber")})
public class Parents implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "parentID")
    private Integer parentID;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 45)
    @Column(name = "surname")
    private String surname;
    @Size(max = 45)
    @Column(name = "occupation")
    private String occupation;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @Column(name = "phonenumber")
    private Integer phonenumber;
    @OneToMany(mappedBy = "parent")
    private List<Students> studentsList;

    public Parents() {
    }

    public Parents(Integer parentID) {
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

    @XmlTransient
    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parentID != null ? parentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parents)) {
            return false;
        }
        Parents other = (Parents) object;
        if ((this.parentID == null && other.parentID != null) || (this.parentID != null && !this.parentID.equals(other.parentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Com.Ecomm.Data.Parents[ parentID=" + parentID + " ]";
    }
    
}
