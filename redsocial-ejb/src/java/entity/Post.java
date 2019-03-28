/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mykex
 */
@Entity
@Table(name = "post")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Post.findAll", query = "SELECT p FROM Post p")
    , @NamedQuery(name = "Post.findById", query = "SELECT p FROM Post p WHERE p.id = :id")
    , @NamedQuery(name = "Post.findByTextPost", query = "SELECT p FROM Post p WHERE p.textPost = :textPost")
    , @NamedQuery(name = "Post.findByDatePost", query = "SELECT p FROM Post p WHERE p.datePost = :datePost")})
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "id")
    private Integer id;   
    @Column(name = "textPost",nullable = false)
    private String textPost;    
    @Column(name = "datePost",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePost;
    @JoinColumn(name = "creator", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User creator;
    @JoinColumn(name = "visibility", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Visibility visibility;

    public Post() {
    }

    public Post(Integer id) {
        this.id = id;
    }

    public Post(Integer id, Date datePost) {
        this.id = id;
        this.datePost = datePost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public Date getDatePost() {
        return datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
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
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Post[ id=" + id + " ]";
    }
    
}
