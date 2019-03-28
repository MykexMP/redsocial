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
@Table(name = "message")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m")
    , @NamedQuery(name = "Message.findById", query = "SELECT m FROM Message m WHERE m.id = :id")
    , @NamedQuery(name = "Message.findByDateSend", query = "SELECT m FROM Message m WHERE m.dateSend = :dateSend")
    , @NamedQuery(name = "Message.findByTextMessage", query = "SELECT m FROM Message m WHERE m.textMessage = :textMessage")
    , @NamedQuery(name = "Message.findByIsRead", query = "SELECT m FROM Message m WHERE m.isRead = :isRead")})
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "id")
    private Integer id;   
    @Column(name = "dateSend",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSend;   
    @Column(name = "textMessage",nullable = false)
    private String textMessage;
    @Column(name = "isRead",nullable = false)
    private Boolean isRead;
    @JoinColumn(name = "sender", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User sender;
    @JoinColumn(name = "receiver", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User receiver;

    public Message() {
    }

    public Message(Integer id) {
        this.id = id;
    }

    public Message(Integer id, Date dateSend) {
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

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Message[ id=" + id + " ]";
    }
    
}
