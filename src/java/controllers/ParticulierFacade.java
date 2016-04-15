/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.Particulier;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tom.rey
 */
@Stateless
public class ParticulierFacade extends AbstractFacade<Particulier> {
    @PersistenceContext(unitName = "ArcomposantPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParticulierFacade() {
        super(Particulier.class);
    }
    
}
