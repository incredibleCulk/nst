package com.mm.domen;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author user
 */
@Entity
@DiscriminatorValue("PL")
public class KupacPravnoLice extends Kupac {

    private static final long serialVersionUID = -7261002554768156879L;

    private String pib;

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    @Override
    public String toString() {
        return String.format("%20S %5d  %20s %20s %10d %20s %20s", "PRAVNO LICE", getKupacId(), getNaziv(), getAdresa(), getMesto().getPtt(), getMesto().getNaziv(), getPib());
    }

}
