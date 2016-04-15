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
@Table(name = "particulier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Particulier.findAll", query = "SELECT p FROM Particulier p"),
    @NamedQuery(name = "Particulier.findById", query = "SELECT p FROM Particulier p WHERE p.id = :id"),
    @NamedQuery(name = "Particulier.findByIdentite", query = "SELECT p FROM Particulier p WHERE p.identite = :identite"),
    @NamedQuery(name = "Particulier.findByNom", query = "SELECT p FROM Particulier p WHERE p.nom = :nom"),
    @NamedQuery(name = "Particulier.findByPrenom", query = "SELECT p FROM Particulier p WHERE p.prenom = :prenom"),
    @NamedQuery(name = "Particulier.findByAdresse", query = "SELECT p FROM Particulier p WHERE p.adresse = :adresse"),
    @NamedQuery(name = "Particulier.findByMail", query = "SELECT p FROM Particulier p WHERE p.mail = :mail"),
    @NamedQuery(name = "Particulier.findByTelephone", query = "SELECT p FROM Particulier p WHERE p.telephone = :telephone")})
public class Particulier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "identite")
    private int identite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "adresse")
    private String adresse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telephone")
    private int telephone;

    public Particulier() {
    }

    public Particulier(Integer id) {
        this.id = id;
    }

    public Particulier(Integer id, int identite, String nom, String prenom, String adresse, String mail, int telephone) {
        this.id = id;
        this.identite = identite;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.telephone = telephone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdentite() {
        return identite;
    }

    public void setIdentite(int identite) {
        this.identite = identite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
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
        if (!(object instanceof Particulier)) {
            return false;
        }
        Particulier other = (Particulier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Particulier[ id=" + id + " ]";
    }
    
}
