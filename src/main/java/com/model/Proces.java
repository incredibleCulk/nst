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
@Table(name = "proces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proces.findAll", query = "SELECT p FROM Proces p")
    , @NamedQuery(name = "Proces.findByIdProcesa", query = "SELECT p FROM Proces p WHERE p.idProcesa = :idProcesa")
    , @NamedQuery(name = "Proces.findByNaziv", query = "SELECT p FROM Proces p WHERE p.naziv = :naziv")
    , @NamedQuery(name = "Proces.findByOznaka", query = "SELECT p FROM Proces p WHERE p.oznaka = :oznaka")
    , @NamedQuery(name = "Proces.findByOpis", query = "SELECT p FROM Proces p WHERE p.opis = :opis")
    , @NamedQuery(name = "Proces.findByNivo", query = "SELECT p FROM Proces p WHERE p.nivo = :nivo")})
public class Proces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProcesa")
    private Integer idProcesa;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "nivo")
    private int nivo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProcesa", fetch = FetchType.LAZY)
    private List<Aktivnost> aktivnostList;
    @JoinColumn(name = "idPodsistema", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Podsistem idPodsistema;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idNadprocesa", fetch = FetchType.LAZY)
    private List<Proces> procesList;
    @JoinColumn(name = "idNadprocesa", referencedColumnName = "idProcesa")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Proces idNadprocesa;
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User userID;

    public Proces() {
    }

    public Proces(Integer idProcesa) {
        this.idProcesa = idProcesa;
    }

    public Proces(Integer idProcesa, String naziv, String oznaka, String opis, int nivo) {
        this.idProcesa = idProcesa;
        this.naziv = naziv;
        this.oznaka = oznaka;
        this.opis = opis;
        this.nivo = nivo;
    }

    public Integer getIdProcesa() {
        return idProcesa;
    }

    public void setIdProcesa(Integer idProcesa) {
        this.idProcesa = idProcesa;
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

    public int getNivo() {
        return nivo;
    }

    public void setNivo(int nivo) {
        this.nivo = nivo;
    }

    @XmlTransient
    public List<Aktivnost> getAktivnostList() {
        return aktivnostList;
    }

    public void setAktivnostList(List<Aktivnost> aktivnostList) {
        this.aktivnostList = aktivnostList;
    }

    public Podsistem getIdPodsistema() {
        return idPodsistema;
    }

    public void setIdPodsistema(Podsistem idPodsistema) {
        this.idPodsistema = idPodsistema;
    }

    @XmlTransient
    public List<Proces> getProcesList() {
        return procesList;
    }

    public void setProcesList(List<Proces> procesList) {
        this.procesList = procesList;
    }

    public Proces getIdNadprocesa() {
        return idNadprocesa;
    }

    public void setIdNadprocesa(Proces idNadprocesa) {
        this.idNadprocesa = idNadprocesa;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcesa != null ? idProcesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proces)) {
            return false;
        }
        Proces other = (Proces) object;
        if ((this.idProcesa == null && other.idProcesa != null) || (this.idProcesa != null && !this.idProcesa.equals(other.idProcesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Proces[ idProcesa=" + idProcesa + " ]";
    }
    
}
