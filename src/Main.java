public class Main {
    private static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        System.out.printf("Opkomstplanner v%s%n%n", VERSION);

        Planner planner = new Planner();
        try {
            System.out.println("[ACTIE] Voer leden in.\n[INFO] Stop invoer: END\n");
            planner.readLeden();
            System.out.println();
            System.out.println("[ACTIE] Voer opkomstdata in (dd-mm-yyyy).\n[INFO] Stop invoer: END\n");
            planner.readData();
            System.out.println();
        } catch (Exception ex) {
            System.out.println("[ERR] Er is een fout opgetreden.");
        }

        System.out.println("[INFO] Opkomsten aan het plannen.");
        planner.planOpkomsten();
    }
}
