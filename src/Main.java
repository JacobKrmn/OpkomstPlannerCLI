public class Main {
    private static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        Planner planner = new Planner();

        try {
            System.out.println("[ACTIE] Voer leden in.\n[INFO] Stop invoer: END\n");
            planner.readLeden();
            planner.listLeden();
            System.out.println("[ACTIE] Voer opkomstdata in (dd-mm-yyyy).\n[INFO] Stop invoer: END\n");
            planner.readData();
            planner.listData();
        } catch (Exception ex) {
            System.out.println("[ERR] Er is een fout opgetreden.");
        }
    }
}
