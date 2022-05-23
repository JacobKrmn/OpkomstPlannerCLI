package model;

public class Lid implements Comparable {
    private String naam;
    private int numOpkomsten;

    public Lid(String naam) {
        this.naam = naam;
        numOpkomsten = 0;
    }

    public String getNaam() {
        return naam;
    }

    public int getNumOpkomsten() {
        return numOpkomsten;
    }

    public void addOpkomst() {
        numOpkomsten++;
    }

    public void removeOpkomst() {
        numOpkomsten--;
    }

    public String toString() {
        return "Lid " + naam + " met " + numOpkomsten + " opkomsten";
    }

    @Override
    public int compareTo(Object o) {
        int compareOpkomstNum = ((Lid) o).getNumOpkomsten();
        return this.numOpkomsten - compareOpkomstNum;
    }
}
