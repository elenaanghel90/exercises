package exercitii;

import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti x:");
        int x = input.nextInt();

        System.out.println("x=" + x);

        if ((x % 2) == 0) {
            System.out.println("numar par");
        }
        else{
            System.out.println("numar impar");
        }

    }

}
