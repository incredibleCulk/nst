/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.model.User;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author milisava
 */
@Entity
@Table(name = "podsistem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Podsistem.findAll", query = "SELECT p FROM Podsistem p")
    , @NamedQuery(name = "Podsistem.findById", query = "SELECT p FROM Podsistem p WHERE p.id = :id")
    , @NamedQuery(name = "Podsistem.findByNaziv", query = "SELECT p FROM Podsistem p WHERE p.naziv = :naziv")
    , @NamedQuery(name = "Podsistem.findByOznaka", query = "SELECT p FROM Podsistem p WHERE p.oznaka = :oznaka")
    , @NamedQuery(name = "Podsistem.findByOpis", query = "SELECT p FROM Podsistem p WHERE p.opis = :opis")})
public class Podsistem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "naziv")
    private String naziv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "oznaka")
    private String oznaka;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "opis")
    private String opis;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNadSistema", fetch = FetchType.LAZY)
    private List<Podsistem> podsistemList;
    @JoinColumn(name = "idNadSistema", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Podsistem idNadSistema;
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User userID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPodsistema", fetch = FetchType.LAZY)
    private List<Proces> procesList;

    public Podsistem() {
    }

    public Podsistem(Integer id) {
        this.id = id;
    }

    public Podsistem(Integer id, String naziv, String oznaka, String opis) {
        this.id = id;
        this.naziv = naziv;
        this.oznaka = oznaka;
        this.opis = opis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @XmlTransient
    public List<Podsistem> getPodsistemList() {
        return podsistemList;
    }

    public void setPodsistemList(List<Podsistem> podsistemList) {
        this.podsistemList = podsistemList;
    }

    public Podsistem getIdNadSistema() {
        return idNadSistema;
    }

    public void setIdNadSistema(Podsistem idNadSistema) {
        this.idNadSistema = idNadSistema;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    @XmlTransient
    public List<Proces> getProcesList() {
        return procesList;
    }

    public void setProcesList(List<Proces> procesList) {
        this.procesList = procesList;
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
        if (!(object instanceof Podsistem)) {
            return false;
        }
        Podsistem other = (Podsistem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Podsistem[ id=" + id + " ]";
    }
    
}
