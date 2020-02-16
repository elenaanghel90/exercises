package exercitii;

import java.util.Scanner;

public class Exe7Tema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = input.nextInt();
        int i = 1;

        while (i <= n) {

            if (i < n) {

                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
            i++;
        }

    }

}

