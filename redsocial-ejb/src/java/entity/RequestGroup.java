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
@Table(name = "request_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RequestGroup.findAll", query = "SELECT r FROM RequestGroup r")
    , @NamedQuery(name = "RequestGroup.findById", query = "SELECT r FROM RequestGroup r WHERE r.id = :id")
    , @NamedQuery(name = "RequestGroup.findByDateSend", query = "SELECT r FROM RequestGroup r WHERE r.dateSend = :dateSend")})
public class RequestGroup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "id")
    private Integer id;    
    @Column(name = "dateSend",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSend;
    @JoinColumn(name = "sender", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User sender;
    @JoinColumn(name = "receiver", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User receiver;
    @JoinColumn(name = "idGroup", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Groupp idGroup;

    public RequestGroup() {
    }

    public RequestGroup(Integer id) {
        this.id = id;
    }

    public RequestGroup(Integer id, Date dateSend) {
        this.id = id;
        this.dateSend = dateSend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateSend() {
        return dateSend;
    }

    public void setDateSend(Date dateSend) {
        this.dateSend = dateSend;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public Groupp getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Groupp idGroup) {
        this.idGroup = idGroup;
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
        if (!(object instanceof RequestGroup)) {
            return false;
        }
        RequestGroup other = (RequestGroup) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.RequestGroup[ id=" + id + " ]";
    }
    
}
