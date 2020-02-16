package exercitii;

import java.util.Scanner;

public class VerificareNrInIntervalEx8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nr1, nr2;

        do {
            System.out.print("Enter the nr1= ");
            nr1 = in.nextInt();
            System.out.print("Enter the nr2= ");
            nr2 = in.nextInt();
        } while (!(seAflaInInterval(nr1) && seAflaInInterval(nr2)));
        System.out.println("The number " + nr1 + " and the number " + nr2 + " are in the range [0,2]");
    }

    public static boolean seAflaInInterval(int nr) {
        if ((nr >= 0) && (nr <= 2)) {
            return true;
        } else {
            return false;
        }
    }
}
