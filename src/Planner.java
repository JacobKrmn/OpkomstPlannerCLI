import model.Lid;
import model.Opkomst;

import java.util.ArrayList;
import java.util.Scanner;

public class Planner {
    private ArrayList<Lid> leden;
    private ArrayList<Opkomst> opkomsten;

    public Planner() {
        leden = new ArrayList<>();
        opkomsten = new ArrayList<>();
    }

    public void readLeden() {
        ArrayList<String> results = readFromCLI();
        for (String result : results) {
            Lid lid = new Lid(result);
            leden.add(lid);
        }
    }

    /*
    For testing purposes
     */
    public void listLeden() {
        for (Lid lid : leden) {
            System.out.println(lid.toString());
        }
    }

    public void readData() {
        ArrayList<String> results = readFromCLI();
        for (String result : results) {
            Opkomst opkomst = new Opkomst(result);
            opkomsten.add(opkomst);
        }
    }

    /*
    For testing purposes
     */
    public void listData() {
        for (Opkomst opkomst : opkomsten) {
            System.out.println(opkomst.toStringDataOnly());
        }
    }

    private ArrayList<String> readFromCLI() {
        ArrayList<String> results = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input = "";
        String endphrase = "END";

        while (!input.equals(endphrase)) {
            input = scanner.next();
            if (!input.equals(endphrase)) {
                results.add(input);
            }
        }

        return results;
    }

    public void planOpkomsten() {
        //TODO add code logic
    }
}
