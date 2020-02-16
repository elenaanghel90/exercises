package exercitii;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti a = ");
        int a = input.nextInt();

        do {
            System.out.println("a=" + a);
            a--;

        } while (a > 0);
    }
}
