package exercitii;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Euclid3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for a =");
        int a = input.nextInt();

        System.out.print("Enter the value for b = ");
        int b = input.nextInt();

        while (!(a == 0 || a == b)) {
            if (b == 0) {
                System.out.println("The greatest common denominator is: " + a);
                return;
            } else {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
        }
        System.out.println("The greatest common denominator is: " + b);


    }
}
