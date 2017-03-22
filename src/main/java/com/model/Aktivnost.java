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
@Table(name = "aktivnost")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aktivnost.findAll", query = "SELECT a FROM Aktivnost a")
    , @NamedQuery(name = "Aktivnost.findByIdAktivnosti", query = "SELECT a FROM Aktivnost a WHERE a.idAktivnosti = :idAktivnosti")
    , @NamedQuery(name = "Aktivnost.findByNaziv", query = "SELECT a FROM Aktivnost a WHERE a.naziv = :naziv")
    , @NamedQuery(name = "Aktivnost.findByOznaka", query = "SELECT a FROM Aktivnost a WHERE a.oznaka = :oznaka")
    , @NamedQuery(name = "Aktivnost.findByOpis", query = "SELECT a FROM Aktivnost a WHERE a.opis = :opis")})
public class Aktivnost implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAktivnosti")
    private Integer idAktivnosti;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aktivnost", fetch = FetchType.LAZY)
    private List<AktivnostDokument> aktivnostDokumentList;
    @JoinColumn(name = "idProcesa", referencedColumnName = "idProcesa")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Proces idProcesa;
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User userID;

    public Aktivnost() {
    }

    public Aktivnost(Integer idAktivnosti) {
        this.idAktivnosti = idAktivnosti;
    }

    public Aktivnost(Integer idAktivnosti, String naziv, String oznaka, String opis) {
        this.idAktivnosti = idAktivnosti;
        this.naziv = naziv;
        this.oznaka = oznaka;
        this.opis = opis;
    }

    public Integer getIdAktivnosti() {
        return idAktivnosti;
    }

    public void setIdAktivnosti(Integer idAktivnosti) {
        this.idAktivnosti = idAktivnosti;
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
    public List<AktivnostDokument> getAktivnostDokumentList() {
        return aktivnostDokumentList;
    }

    public void setAktivnostDokumentList(List<AktivnostDokument> aktivnostDokumentList) {
        this.aktivnostDokumentList = aktivnostDokumentList;
    }

    public Proces getIdProcesa() {
        return idProcesa;
    }

    public void setIdProcesa(Proces idProcesa) {
        this.idProcesa = idProcesa;
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
        hash += (idAktivnosti != null ? idAktivnosti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aktivnost)) {
            return false;
        }
        Aktivnost other = (Aktivnost) object;
        if ((this.idAktivnosti == null && other.idAktivnosti != null) || (this.idAktivnosti != null && !this.idAktivnosti.equals(other.idAktivnosti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Aktivnost[ idAktivnosti=" + idAktivnosti + " ]";
    }
    
}
