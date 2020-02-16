package exercitii;

import java.util.Scanner;

public class Exe2TemaSapt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int n;
        n = input.nextInt();
        while (n > 0) {
            if ((n % 2) == 0)
            {
                System.out.println("n = " + n);

            }
            n--;
        }

    }
}

