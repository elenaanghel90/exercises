package exercitii;

import java.util.Scanner;


public class Exe10Tema3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n = ");
        int n = input.nextInt();
        int counter = 1;

        while (counter <= (n * n)) {
            System.out.print( "$");
            if ((counter % n) == 0)
            {
                System.out.println("");
            }
            counter++;

        }



    }
}


