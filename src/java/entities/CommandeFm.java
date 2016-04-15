/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tom.rey
 */
@Entity
@Table(name = "commande_fm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CommandeFm.findAll", query = "SELECT c FROM CommandeFm c"),
    @NamedQuery(name = "CommandeFm.findByIdComposant", query = "SELECT c FROM CommandeFm c WHERE c.commandeFmPK.idComposant = :idComposant"),
    @NamedQuery(name = "CommandeFm.findByIdFournisseur", query = "SELECT c FROM CommandeFm c WHERE c.commandeFmPK.idFournisseur = :idFournisseur"),
    @NamedQuery(name = "CommandeFm.findByIdMagasin", query = "SELECT c FROM CommandeFm c WHERE c.idMagasin = :idMagasin"),
    @NamedQuery(name = "CommandeFm.findByQuantite", query = "SELECT c FROM CommandeFm c WHERE c.quantite = :quantite"),
    @NamedQuery(name = "CommandeFm.findByDate", query = "SELECT c FROM CommandeFm c WHERE c.date = :date")})
public class CommandeFm implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CommandeFmPK commandeFmPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_magasin")
    private int idMagasin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantite")
    private int quantite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public CommandeFm() {
    }

    public CommandeFm(CommandeFmPK commandeFmPK) {
        this.commandeFmPK = commandeFmPK;
    }

    public CommandeFm(CommandeFmPK commandeFmPK, int idMagasin, int quantite, Date date) {
        this.commandeFmPK = commandeFmPK;
        this.idMagasin = idMagasin;
        this.quantite = quantite;
        this.date = date;
    }

    public CommandeFm(int idComposant, int idFournisseur) {
        this.commandeFmPK = new CommandeFmPK(idComposant, idFournisseur);
    }

    public CommandeFmPK getCommandeFmPK() {
        return commandeFmPK;
    }

    public void setCommandeFmPK(CommandeFmPK commandeFmPK) {
        this.commandeFmPK = commandeFmPK;
    }

    public int getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(int idMagasin) {
        this.idMagasin = idMagasin;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commandeFmPK != null ? commandeFmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommandeFm)) {
            return false;
        }
        CommandeFm other = (CommandeFm) object;
        if ((this.commandeFmPK == null && other.commandeFmPK != null) || (this.commandeFmPK != null && !this.commandeFmPK.equals(other.commandeFmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CommandeFm[ commandeFmPK=" + commandeFmPK + " ]";
    }
    
}
