package exercitii;

import java.util.Scanner;

public class Exe2TemaSapt2Var2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number = ");
        int n;
        n = input.nextInt();
        do {
            if ((n % 2) == 0) {
                System.out.println("n = " + n);
            }
            n--;

        } while (n > 0);


    }
}


