package exercitii;

import java.util.Scanner;

public class TreiNrPozNegSiSumaSeparataEx5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contorPoz = 0;
        int contorNeg = 0;
        int sumNrPoz = 0, sumNrNeg = 0;


        while ((contorPoz < 3) || (contorNeg < 3)) {
            System.out.print("Enter the number = ");
            int nr = in.nextInt();
            if (nr > 0) {
                if (contorPoz < 3) {
                    sumNrPoz += nr;
                }
                contorPoz++;

            } else {

                if (contorNeg < 3) {
                    sumNrNeg += nr;
                }
                contorNeg++;
            }
        }
        System.out.print("The sum of negative numbers is = " + sumNrNeg + " and The sum of positive numbers is = " + sumNrPoz);
    }
}
