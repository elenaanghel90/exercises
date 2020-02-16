package exercitii;

import java.util.Scanner;

public class Exe1Tema {
            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for verify if is positive = ");
        int a = input.nextInt();

        if (a >= 0) {
            System.out.println("The number entered is positive");
        } else {
            System.out.println("The number entered is negative");
        }


    }
}
