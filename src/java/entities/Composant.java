/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tom.rey
 */
@Entity
@Table(name = "composant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Composant.findAll", query = "SELECT c FROM Composant c"),
    @NamedQuery(name = "Composant.findById", query = "SELECT c FROM Composant c WHERE c.id = :id"),
    @NamedQuery(name = "Composant.findByIdType", query = "SELECT c FROM Composant c WHERE c.idType = :idType"),
    @NamedQuery(name = "Composant.findByNom", query = "SELECT c FROM Composant c WHERE c.nom = :nom"),
    @NamedQuery(name = "Composant.findByMarque", query = "SELECT c FROM Composant c WHERE c.marque = :marque"),
    @NamedQuery(name = "Composant.findByDescription", query = "SELECT c FROM Composant c WHERE c.description = :description"),
    @NamedQuery(name = "Composant.findByPrix", query = "SELECT c FROM Composant c WHERE c.prix = :prix")})
public class Composant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_type")
    private int idType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "marque")
    private String marque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prix")
    private int prix;

    public Composant() {
    }

    public Composant(Integer id) {
        this.id = id;
    }

    public Composant(Integer id, int idType, String nom, String marque, String description, int prix) {
        this.id = id;
        this.idType = idType;
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Composant)) {
            return false;
        }
        Composant other = (Composant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Composant[ id=" + id + " ]";
    }
    
}
