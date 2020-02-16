package exercitii;

import java.util.Scanner;

public class Exe9Tema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number a = ");
        int a = input.nextInt();
        System.out.print("Enter the number b = ");
        int b = input.nextInt();
        System.out.print("Enter the number c = ");
        int c = input.nextInt();
        int stockNo;

        while ((a > b) || (b > c)) {
            if (a > b) {
                stockNo = a;
                a = b;
                b = stockNo;
            }
            if (b > c) {
                stockNo = b;
                b = c;
                c = stockNo;
            }
        }
        System.out.println(" The ascending order of number entered = " + a + " , " + b + " , " + c );
    }
}
