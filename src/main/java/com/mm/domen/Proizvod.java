package com.mm.domen;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tip")
@Table(name = "proizvod")
public class Proizvod implements Serializable {

    private static final long serialVersionUID = -8354523413476179064L;

    @Id
    @Column(name = "proizvodId")
    private Long proizvodId;

    @Column(name = "naziv")
    private String naziv;

    @Column(name = "cena")
    private Double cena;

    @ManyToMany(mappedBy = "proizvodi")
    private List<Dobavljac> dobavljaci;

    public void registrujProiazvodZaDobavljaca(Dobavljac dobavljac) {
        dobavljaci.add(dobavljac);
        dobavljac.getProizvodi().add(this);
    }

    public Long getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(Long proizvodId) {
        this.proizvodId = proizvodId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public List<Dobavljac> getDobavljaci() {
        return dobavljaci;
    }

    public void setDobavljaci(List<Dobavljac> dobavljaci) {
        this.dobavljaci = dobavljaci;
    }

}
