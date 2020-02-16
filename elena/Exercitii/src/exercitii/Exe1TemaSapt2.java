package exercitii;

import java.util.Scanner;

public class Exe1TemaSapt2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        do
        {
            System.out.print("Give me a number: ");
            number = keyboard.nextInt();
        }while (number%10 > 0);
    }
}

