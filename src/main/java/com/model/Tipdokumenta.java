/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

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
@Table(name = "tipdokumenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipdokumenta.findAll", query = "SELECT t FROM Tipdokumenta t")
    , @NamedQuery(name = "Tipdokumenta.findById", query = "SELECT t FROM Tipdokumenta t WHERE t.id = :id")
    , @NamedQuery(name = "Tipdokumenta.findByNaziv", query = "SELECT t FROM Tipdokumenta t WHERE t.naziv = :naziv")
    , @NamedQuery(name = "Tipdokumenta.findByOpis", query = "SELECT t FROM Tipdokumenta t WHERE t.opis = :opis")
    , @NamedQuery(name = "Tipdokumenta.findByLokacijaModela", query = "SELECT t FROM Tipdokumenta t WHERE t.lokacijaModela = :lokacijaModela")})
public class Tipdokumenta implements Serializable {

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
    @Size(min = 1, max = 2000)
    @Column(name = "opis")
    private String opis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "lokacijaModela")
    private String lokacijaModela;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipaDokumenta", fetch = FetchType.LAZY)
    private List<Dokument> dokumentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipdokumenta", fetch = FetchType.LAZY)
    private List<AktivnostDokument> aktivnostDokumentList;

    public Tipdokumenta() {
    }

    public Tipdokumenta(Integer id) {
        this.id = id;
    }

    public Tipdokumenta(Integer id, String naziv, String opis, String lokacijaModela) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.lokacijaModela = lokacijaModela;
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

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getLokacijaModela() {
        return lokacijaModela;
    }

    public void setLokacijaModela(String lokacijaModela) {
        this.lokacijaModela = lokacijaModela;
    }

    @XmlTransient
    public List<Dokument> getDokumentList() {
        return dokumentList;
    }

    public void setDokumentList(List<Dokument> dokumentList) {
        this.dokumentList = dokumentList;
    }

    @XmlTransient
    public List<AktivnostDokument> getAktivnostDokumentList() {
        return aktivnostDokumentList;
    }

    public void setAktivnostDokumentList(List<AktivnostDokument> aktivnostDokumentList) {
        this.aktivnostDokumentList = aktivnostDokumentList;
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
        if (!(object instanceof Tipdokumenta)) {
            return false;
        }
        Tipdokumenta other = (Tipdokumenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Tipdokumenta[ id=" + id + " ]";
    }
    
}
