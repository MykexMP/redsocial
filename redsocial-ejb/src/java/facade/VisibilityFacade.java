/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Visibility;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mykex
 */
@Stateless
public class VisibilityFacade extends AbstractFacade<Visibility> {

    @PersistenceContext(unitName = "redsocial-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VisibilityFacade() {
        super(Visibility.class);
    }
    
}
