package exercitii;

import java.util.Scanner;

public class SumaNNumereEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number n = ");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(" Enter the number= ");
            sum += in.nextInt();
        }
        System.out.println("The sum is = " + sum);
    }
}
