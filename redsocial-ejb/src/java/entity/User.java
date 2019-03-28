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
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id")
    , @NamedQuery(name = "User.findByNameUser", query = "SELECT u FROM User u WHERE u.nameUser = :nameUser")
    , @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
    , @NamedQuery(name = "User.findByPass", query = "SELECT u FROM User u WHERE u.pass = :pass")
    , @NamedQuery(name = "User.findByAlias", query = "SELECT u FROM User u WHERE u.alias = :alias")
    , @NamedQuery(name = "User.findByDateIn", query = "SELECT u FROM User u WHERE u.dateIn = :dateIn")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "id")
    private Integer id;    
    @Column(name = "nameUser",nullable = false)
    private String nameUser;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "pass",nullable = false)
    private String pass;
    @Column(name = "alias",nullable = false)
    private String alias;
    @Column(name = "dateIn",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateIn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private List<UserGroup> userGroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "creator")
    private List<Post> postList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sender")
    private List<RequestFriend> requestFriendList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receiver")
    private List<RequestFriend> requestFriendList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sender")
    private List<RequestGroup> requestGroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receiver")
    private List<RequestGroup> requestGroupList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sender")
    private List<Friend> friendList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receiver")
    private List<Friend> friendList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ownerGroup")
    private List<Groupp> grouppList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sender")
    private List<Message> messageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receiver")
    private List<Message> messageList1;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String email, String pass, String alias, Date dateIn) {
        this.id = id;
        this.email = email;
        this.pass = pass;
        this.alias = alias;
        this.dateIn = dateIn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    @XmlTransient
    public List<UserGroup> getUserGroupList() {
        return userGroupList;
    }

    public void setUserGroupList(List<UserGroup> userGroupList) {
        this.userGroupList = userGroupList;
    }

    @XmlTransient
    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @XmlTransient
    public List<RequestFriend> getRequestFriendList() {
        return requestFriendList;
    }

    public void setRequestFriendList(List<RequestFriend> requestFriendList) {
        this.requestFriendList = requestFriendList;
    }

    @XmlTransient
    public List<RequestFriend> getRequestFriendList1() {
        return requestFriendList1;
    }

    public void setRequestFriendList1(List<RequestFriend> requestFriendList1) {
        this.requestFriendList1 = requestFriendList1;
    }

    @XmlTransient
    public List<RequestGroup> getRequestGroupList() {
        return requestGroupList;
    }

    public void setRequestGroupList(List<RequestGroup> requestGroupList) {
        this.requestGroupList = requestGroupList;
    }

    @XmlTransient
    public List<RequestGroup> getRequestGroupList1() {
        return requestGroupList1;
    }

    public void setRequestGroupList1(List<RequestGroup> requestGroupList1) {
        this.requestGroupList1 = requestGroupList1;
    }

    @XmlTransient
    public List<Friend> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<Friend> friendList) {
        this.friendList = friendList;
    }

    @XmlTransient
    public List<Friend> getFriendList1() {
        return friendList1;
    }

    public void setFriendList1(List<Friend> friendList1) {
        this.friendList1 = friendList1;
    }

    @XmlTransient
    public List<Groupp> getGrouppList() {
        return grouppList;
    }

    public void setGrouppList(List<Groupp> grouppList) {
        this.grouppList = grouppList;
    }

    @XmlTransient
    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    @XmlTransient
    public List<Message> getMessageList1() {
        return messageList1;
    }

    public void setMessageList1(List<Message> messageList1) {
        this.messageList1 = messageList1;
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.User[ id=" + id + " ]";
    }
    
}
