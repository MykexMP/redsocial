/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Groupp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mykex
 */
@Stateless
public class GrouppFacade extends AbstractFacade<Groupp> {

    @PersistenceContext(unitName = "redsocial-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GrouppFacade() {
        super(Groupp.class);
    }
    
}
