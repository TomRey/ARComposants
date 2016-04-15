/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Composant;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tom.rey
 */
@Stateless
public class ComposantFacade extends AbstractFacade<Composant> {
    @PersistenceContext(unitName = "ArcomposantPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComposantFacade() {
        super(Composant.class);
    }
    
}
