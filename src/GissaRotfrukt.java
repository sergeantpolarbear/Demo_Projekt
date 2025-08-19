public class GissaRotfrukt {
    public static void main(String[] args) {
        String[] rotfrukter = {"morot", "potatis", "rödbetor", "kålrot"};
        java.util.Scanner tangentbord = new java.util.Scanner(System.in);
        int poang = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Gissa en rotfrukt: ");
            String gissning = tangentbord.nextLine().trim().toLowerCase();
            boolean ratt = false;
            for (String rotfrukt : rotfrukter) {
                if (gissning.equals(rotfrukt)) {
                    ratt = true;
                    break;
                }
            }
            if (ratt) {
                poang++;
                System.out.println("Rätt svar!");
            }
        }
        System.out.println("Total poäng " + poang + " av 3");
        tangentbord.close();
    }
}