/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entities.CommandePm;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tom.rey
 */
@Stateless
public class CommandePmFacade extends AbstractFacade<CommandePm> {
    @PersistenceContext(unitName = "ArcomposantPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CommandePmFacade() {
        super(CommandePm.class);
    }
    
}
