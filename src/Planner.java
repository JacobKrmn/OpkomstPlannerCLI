import model.Lid;
import model.Opkomst;

import java.util.ArrayList;
import java.util.Collections;
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
        //Randomize list of names
        Collections.shuffle(leden);

        //Go over list of opkomsten and assign next two leden in the list to an opkomst
        int lidIndex = 0;
        for (Opkomst opkomst : opkomsten) {
            Lid lid1 = leden.get(0);
            lid1.addOpkomst();
            opkomst.setLid1(lid1);

            Lid lid2 = leden.get(1);
            lid2.addOpkomst();
            opkomst.setLid2(lid2);

            //Sort list to distribute opkomsten evenly
            Collections.sort(leden);
        }

        for (Opkomst opkomst : opkomsten) {
            System.out.println(opkomst.toString());
        }

        System.out.println();
        System.out.println("Overzicht van leden:");

        for (Lid lid : leden) {
            System.out.println(lid.toString());
        }
    }
}
