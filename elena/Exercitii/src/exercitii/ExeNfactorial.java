package exercitii;

import java.util.Scanner;

public class ExeNfactorial {
    public static void main(String[] args) {
        Scanner intrare = new Scanner(System.in);
        int n = 1;

        while (n > 0) {
            System.out.print("Introduceti N:");
            n = intrare.nextInt();
            int rezultat = 1;
            int multiplicator = 2;

            while (multiplicator <= n) {
                rezultat *= multiplicator;
                //rezultat = rezultat *multiplicator;
                multiplicator++;
            }
            if (n > 0) {
                System.out.println("N! = " + rezultat);


            }
            else
                System.out.println("Ati introdus valoarea zero");
        }
    }
}

