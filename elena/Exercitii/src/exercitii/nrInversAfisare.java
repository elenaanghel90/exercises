package exercitii;

import java.util.Scanner;

public class nrInversAfisare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int numar = input.nextInt();
String nrInvers = "";
        while (numar > 0) {

            System.out.print(numar % 10);
            nrInvers+= numar%10; //nrInvers=nrInvers + (numar % 10);
            numar = numar / 10;

        }
        System.out.println("\n" + nrInvers);


    }

}

