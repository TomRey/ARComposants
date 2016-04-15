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
@Table(name = "commande_pm")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CommandePm.findAll", query = "SELECT c FROM CommandePm c"),
    @NamedQuery(name = "CommandePm.findByIdComposant", query = "SELECT c FROM CommandePm c WHERE c.commandePmPK.idComposant = :idComposant"),
    @NamedQuery(name = "CommandePm.findByIdMagasin", query = "SELECT c FROM CommandePm c WHERE c.commandePmPK.idMagasin = :idMagasin"),
    @NamedQuery(name = "CommandePm.findByIdParticulier", query = "SELECT c FROM CommandePm c WHERE c.idParticulier = :idParticulier"),
    @NamedQuery(name = "CommandePm.findByQuantite", query = "SELECT c FROM CommandePm c WHERE c.quantite = :quantite"),
    @NamedQuery(name = "CommandePm.findByDate", query = "SELECT c FROM CommandePm c WHERE c.date = :date")})
public class CommandePm implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CommandePmPK commandePmPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_particulier")
    private int idParticulier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantite")
    private int quantite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public CommandePm() {
    }

    public CommandePm(CommandePmPK commandePmPK) {
        this.commandePmPK = commandePmPK;
    }

    public CommandePm(CommandePmPK commandePmPK, int idParticulier, int quantite, Date date) {
        this.commandePmPK = commandePmPK;
        this.idParticulier = idParticulier;
        this.quantite = quantite;
        this.date = date;
    }

    public CommandePm(int idComposant, int idMagasin) {
        this.commandePmPK = new CommandePmPK(idComposant, idMagasin);
    }

    public CommandePmPK getCommandePmPK() {
        return commandePmPK;
    }

    public void setCommandePmPK(CommandePmPK commandePmPK) {
        this.commandePmPK = commandePmPK;
    }

    public int getIdParticulier() {
        return idParticulier;
    }

    public void setIdParticulier(int idParticulier) {
        this.idParticulier = idParticulier;
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
        hash += (commandePmPK != null ? commandePmPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommandePm)) {
            return false;
        }
        CommandePm other = (CommandePm) object;
        if ((this.commandePmPK == null && other.commandePmPK != null) || (this.commandePmPK != null && !this.commandePmPK.equals(other.commandePmPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CommandePm[ commandePmPK=" + commandePmPK + " ]";
    }
    
}
