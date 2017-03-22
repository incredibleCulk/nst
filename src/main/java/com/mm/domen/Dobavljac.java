package com.mm.domen;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "dobavljac")
public class Dobavljac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dobavljacID")
    private Integer dobavljacID;
    @Lob
    @Column(name = "naziv")
    private String naziv;
    @Lob
    @Column(name = "adresa")
    private String adresa;

    @ManyToMany
    @JoinTable(
            name = "dobavlja",
            joinColumns = @JoinColumn(name = "dobavljacID", referencedColumnName = "dobavljacID"),
            inverseJoinColumns = @JoinColumn(name = "proizvodID", referencedColumnName = "proizvodID"))
    private List<Proizvod> proizvodi;

    public Dobavljac() {
    }

    public Dobavljac(Integer dobavljacID) {
        this.dobavljacID = dobavljacID;
    }

    public Integer getDobavljacID() {
        return dobavljacID;
    }

    public void setDobavljacID(Integer dobavljacID) {
        this.dobavljacID = dobavljacID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dobavljacID != null ? dobavljacID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dobavljac)) {
            return false;
        }
        Dobavljac other = (Dobavljac) object;
        if ((this.dobavljacID == null && other.dobavljacID != null) || (this.dobavljacID != null && !this.dobavljacID.equals(other.dobavljacID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("%-8s", String.valueOf(getDobavljacID())) + String.format("%30s%30s", getNaziv(), getAdresa());
    }

    public List<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }
}
