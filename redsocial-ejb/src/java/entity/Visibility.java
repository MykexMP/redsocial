/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mykex
 */
@Entity
@Table(name = "visibility")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visibility.findAll", query = "SELECT v FROM Visibility v")
    , @NamedQuery(name = "Visibility.findById", query = "SELECT v FROM Visibility v WHERE v.id = :id")
    , @NamedQuery(name = "Visibility.findByTypeVis", query = "SELECT v FROM Visibility v WHERE v.typeVis = :typeVis")})
public class Visibility implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "id")
    private Integer id;    
    @Column(name = "typeVis",nullable = false)
    private String typeVis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visibility")
    private List<Post> postList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visibility")
    private List<Groupp> grouppList;

    public Visibility() {
    }

    public Visibility(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeVis() {
        return typeVis;
    }

    public void setTypeVis(String typeVis) {
        this.typeVis = typeVis;
    }

    @XmlTransient
    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @XmlTransient
    public List<Groupp> getGrouppList() {
        return grouppList;
    }

    public void setGrouppList(List<Groupp> grouppList) {
        this.grouppList = grouppList;
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
        if (!(object instanceof Visibility)) {
            return false;
        }
        Visibility other = (Visibility) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Visibility[ id=" + id + " ]";
    }
    
}
