/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tom.rey
 */
@Embeddable
public class CommandeFmPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_composant")
    private int idComposant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_fournisseur")
    private int idFournisseur;

    public CommandeFmPK() {
    }

    public CommandeFmPK(int idComposant, int idFournisseur) {
        this.idComposant = idComposant;
        this.idFournisseur = idFournisseur;
    }

    public int getIdComposant() {
        return idComposant;
    }

    public void setIdComposant(int idComposant) {
        this.idComposant = idComposant;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idComposant;
        hash += (int) idFournisseur;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommandeFmPK)) {
            return false;
        }
        CommandeFmPK other = (CommandeFmPK) object;
        if (this.idComposant != other.idComposant) {
            return false;
        }
        if (this.idFournisseur != other.idFournisseur) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CommandeFmPK[ idComposant=" + idComposant + ", idFournisseur=" + idFournisseur + " ]";
    }
    
}
