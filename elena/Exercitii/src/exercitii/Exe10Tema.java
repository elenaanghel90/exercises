package exercitii;

import java.util.Scanner;

public class Exe10Tema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n = ");
        int n = input.nextInt();

        int i2 = 1;


        while (i2 <= n) {
            i2++;
            int i = 1; // il initializam  cu 1 ca sa se execute din nou al doilea while
            System.out.println(); //ca sa treaca pe urmatorul rand
            while (i <= n) {
                i++;
                System.out.print("$");
            }

        }
    }
}

//primul while trece pe al doilea rand si al doilea printeaza $ pe un rand