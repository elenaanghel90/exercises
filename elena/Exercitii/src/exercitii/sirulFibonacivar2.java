package exercitii;

import java.util.Arrays;
import java.util.Scanner;

public class sirulFibonacivar2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the n = ");
        int n = input.nextInt();
        int[] sir = new int[n];

        int fib1 = 0;
        int fib2 = 1;
        int fib3;
        int i;

        System.out.print(fib1 + " " + fib2);
        for (i = 2 ; i < n; i++){
            fib3 = fib1 + fib2;
            System.out.print(" " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }



    }
}


