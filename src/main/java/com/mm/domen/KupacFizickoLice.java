package com.mm.domen;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author user
 */
@Entity
@DiscriminatorValue("FL")
public class KupacFizickoLice extends Kupac {

    private static final long serialVersionUID = -2971949486447430532L;
    private String jmbg;

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getJmbg() {
        return jmbg;
    }

    @Override
    public String toString() {
        return String.format("%20S %5d  %20s %20s %10d %20s %20s", "FIZICKO LICE", getKupacId(), getNaziv(), getAdresa(), getMesto().getPtt(), getMesto().getNaziv(), getJmbg());
    }

}
