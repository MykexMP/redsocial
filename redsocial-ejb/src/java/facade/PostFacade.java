/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Post;
import entity.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Mykex
 */
@Stateless
public class PostFacade extends AbstractFacade<Post> {

    @PersistenceContext(unitName = "redsocial-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PostFacade() {
        super(Post.class);
    }
    
    public List<Post> findAllPostMainWindow(User u){
        Query q = em.createQuery("SELECT p FROM Post p WHERE (p.visibility.typeVis = 'Public') or (p.creator = :u) ORDER BY p.datePost DESC"); // Edit Query
        // or (:u2 MEMBER OF p.creator.friendList AND p.visibility.typeVis = 'Friends')
        // or (?? AND p.visibility.typeVis = 'Group')
        q.setParameter("u", u);
        return q.getResultList();
    }
    
}
