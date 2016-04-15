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
public class CommandePmPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_composant")
    private int idComposant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_magasin")
    private int idMagasin;

    public CommandePmPK() {
    }

    public CommandePmPK(int idComposant, int idMagasin) {
        this.idComposant = idComposant;
        this.idMagasin = idMagasin;
    }

    public int getIdComposant() {
        return idComposant;
    }

    public void setIdComposant(int idComposant) {
        this.idComposant = idComposant;
    }

    public int getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(int idMagasin) {
        this.idMagasin = idMagasin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idComposant;
        hash += (int) idMagasin;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommandePmPK)) {
            return false;
        }
        CommandePmPK other = (CommandePmPK) object;
        if (this.idComposant != other.idComposant) {
            return false;
        }
        if (this.idMagasin != other.idMagasin) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CommandePmPK[ idComposant=" + idComposant + ", idMagasin=" + idMagasin + " ]";
    }
    
}
