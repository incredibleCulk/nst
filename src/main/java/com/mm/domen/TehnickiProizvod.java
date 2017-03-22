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
@Table(name = "tehnickiproizvod")
@DiscriminatorValue("T")
public class TehnickiProizvod extends Proizvod {

    private static final long serialVersionUID = -3192903452655624582L;

    @Column(name = "tehnickeosobine")
    private String tehnickeOsobine;

    @Column(name = "garancija")
    private int garancija;

    @Column(name = "uputstvo")
    private String uputstvo;

    public String getTehnickeOsobine() {
        return tehnickeOsobine;
    }

    public void setTehnickeOsobine(String tehnickeOsobine) {
        this.tehnickeOsobine = tehnickeOsobine;
    }

    public int getGarancija() {
        return garancija;
    }

    public void setGarancija(int garancija) {
        this.garancija = garancija;
    }

    public String getUputstvo() {
        return uputstvo;
    }

    public void setUputstvo(String uputstvo) {
        this.uputstvo = uputstvo;
    }

    @Override
    public String toString() {
        return String.format("%-15s %10s %.2f %10s %10s %3d", "TEHNICKI:", getNaziv(), getCena(), getTehnickeOsobine(), getUputstvo(), getGarancija());
    }

}
