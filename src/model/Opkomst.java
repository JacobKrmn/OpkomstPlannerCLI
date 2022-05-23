package model;

import java.util.Date;

public class Opkomst {
    private Lid lid1;
    private Lid lid2;
    private String datum; //dd-mm-yyyy


    public Opkomst(String datum) {
        this.datum = datum;
    }

    public Lid getLid1() {
        return lid1;
    }

    public void setLid1(Lid lid) {
        lid1 = lid;
    }

    public Lid getLid2() {
        return lid2;
    }

    public void setLid2(Lid lid) {
        lid2 = lid;
    }

    public String getDatum() {
        return datum;
    }

    public String toStringDataOnly() {
        return "Opkomst op " + datum;
    }

    public String toString() {
        return "Opkomst van " + lid1.getNaam() + " en " + lid2.getNaam() + " op " + datum;
    }
}
