package com.mm.domen;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "prehrambeniproizvod")
@DiscriminatorValue("P")
public class PrehrambeniProizvod extends Proizvod {

    private static final long serialVersionUID = 2188504902902703433L;
    @Column(name = "roktrajanja")
    private String roktrajanja;

    @Column(name = "sastav")
    private String sastav;

    public String getRoktrajanja() {
        return roktrajanja;
    }

    public void setRoktrajanja(String roktrajanja) {
        this.roktrajanja = roktrajanja;
    }

    public String getSastav() {
        return sastav;
    }

    public void setSastav(String sastav) {
        this.sastav = sastav;
    }

    @Override
    public String toString() {
        return String.format("%-15s %10s %.2f %10s %10s ", "PREHRAMBENI:", getNaziv(), getCena(), getRoktrajanja(), getSastav());
    }

}
