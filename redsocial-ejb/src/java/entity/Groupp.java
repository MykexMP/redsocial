/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mykex
 */
@Entity
@Table(name = "groupp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupp.findAll", query = "SELECT g FROM Groupp g")
    , @NamedQuery(name = "Groupp.findById", query = "SELECT g FROM Groupp g WHERE g.id = :id")
    , @NamedQuery(name = "Groupp.findByNameGroup", query = "SELECT g FROM Groupp g WHERE g.nameGroup = :nameGroup")
    , @NamedQuery(name = "Groupp.findByDescript", query = "SELECT g FROM Groupp g WHERE g.descript = :descript")
    , @NamedQuery(name = "Groupp.findByDateCreation", query = "SELECT g FROM Groupp g WHERE g.dateCreation = :dateCreation")})
public class Groupp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;    
    @Column(name = "nameGroup",nullable = false)
    private String nameGroup;   
    @Column(name = "descript",nullable = false)
    private String descript;   
    @Column(name = "dateCreation",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGroup")
    private List<UserGroup> userGroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGroup")
    private List<RequestGroup> requestGroupList;
    @JoinColumn(name = "ownerGroup", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User ownerGroup;
    @JoinColumn(name = "visibility", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Visibility visibility;

    public Groupp() {
    }

    public Groupp(Integer id) {
        this.id = id;
    }

    public Groupp(Integer id, String nameGroup, Date dateCreation) {
        this.id = id;
        this.nameGroup = nameGroup;
        this.dateCreation = dateCreation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @XmlTransient
    public List<UserGroup> getUserGroupList() {
        return userGroupList;
    }

    public void setUserGroupList(List<UserGroup> userGroupList) {
        this.userGroupList = userGroupList;
    }

    @XmlTransient
    public List<RequestGroup> getRequestGroupList() {
        return requestGroupList;
    }

    public void setRequestGroupList(List<RequestGroup> requestGroupList) {
        this.requestGroupList = requestGroupList;
    }

    public User getOwnerGroup() {
        return ownerGroup;
    }

    public void setOwnerGroup(User ownerGroup) {
        this.ownerGroup = ownerGroup;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupp)) {
            return false;
        }
        Groupp other = (Groupp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Groupp[ id=" + id + " ]";
    }
    
}
