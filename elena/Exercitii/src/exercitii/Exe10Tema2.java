package exercitii;

import java.util.Scanner;

public class Exe10Tema2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n = ");
        int n = input.nextInt();
        int counterlinii = 1;

        while (counterlinii <= n)
        {
            int counter = 1;
            while (counter <= n) {
                System.out.print("$");
                counter++;
            }
            System.out.println();
            counterlinii++;
        }
    }
}