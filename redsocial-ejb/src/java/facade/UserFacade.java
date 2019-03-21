/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Mykex
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName = "redsocial-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
    public User findByAliasAndPassword(String alias, String password) {
        Query q = em.createQuery("SELECT u FROM User u WHERE u.alias = :alias and u.pass = :password");
        q.setParameter("alias", alias).setParameter("password", password);
        if(q.getResultList().size()<1) return null; 
        else return (User) q.getResultList().get(0); 
    }
    
    public User findByEmail(String email){
        Query q = em.createQuery("SELECT u FROM User u WHERE u.email = :email");
        q.setParameter("email", email);
        if(q.getResultList().size()<1) return null; 
        else return (User) q.getResultList().get(0); 
    }
    
}
