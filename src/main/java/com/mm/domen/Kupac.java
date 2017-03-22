package com.mm.domen;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "kupac")
@Inheritance
@DiscriminatorColumn(name = "tip")
public class Kupac implements Serializable {

    private static final long serialVersionUID = 9019611205786434483L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kupacID")
    private long kupacId;
    @Column(name = "naziv")
    private String naziv;
    @Column(name = "adresa")
    private String adresa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pttID") //FK
    private Mesto mesto;

    public Kupac() {
    }

    public Kupac(String naziv, String adresa, Mesto mesto) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.mesto = mesto;
    }

    public long getKupacId() {
        return kupacId;
    }

    public void setKupacId(long kupacId) {
        this.kupacId = kupacId;
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
    public String toString() {
        return String.format("%5d  %20s %20s %10d %20s", getKupacId(), getNaziv(), getAdresa(), getMesto().getPtt(), getMesto().getNaziv());
    }

    public Mesto getMesto() {
        return mesto;
    }

    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

}
