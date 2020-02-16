package exercitii;

import java.util.Scanner;

public class Exe3TemaSapt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr;
        int restul;
        int catul;

        do {
            System.out.println("Enter the number =");
            nr = input.nextInt();
            restul = nr % 10;
            catul = nr / 10;
        } while (restul != catul);


    }
}


