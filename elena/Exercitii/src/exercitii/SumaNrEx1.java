package exercitii;

import java.util.Scanner;

public class SumaNrEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;


        for(int i=0; i <=5; i++) {
            System.out.print("Enter the number = ");
            sum +=in.nextInt();
        }
        System.out.println("The sum of number is = " + sum);
    }
}
