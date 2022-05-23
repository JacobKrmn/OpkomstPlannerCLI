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

    public Lid getLid2() {
        return lid2;
    }

    public String getDatum() {
        return datum;
    }

    public String toStringDataOnly() {
        return "Opkomst op " + datum;
    }

    public String toString() {
        String str = "Opkomst van %s en %s op %s";
        str.format(str, lid1.getNaam(), lid2.getNaam(), datum);
        return str;
    }
}
