import java.util.Random;
import java.util.Scanner;

public class GissaTal {
    public static void main(String[] args) {
        Random slumpGenerator = new Random();
        int hemligtTal = slumpGenerator.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Du ska gissa ett tal 1-10, du har 3 försök");
        boolean korrekt = false;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Gissa ett tal 1-10: ");
            int gissning = scanner.nextInt();

            if (gissning == hemligtTal) {
                System.out.println("RÄTT, bra jobbat!!!");
                korrekt = true;
                break;
            } else if (gissning < hemligtTal) {
                System.out.println("Du gissade för lågt");
            } else {
                System.out.println("Du gissade för högt");
            }
        }

        if (!korrekt) {
            System.out.println("Tyvärr, du gissade inte rätt. Det hemliga talet var " + hemligtTal);
        }

        scanner.close();
    }
}