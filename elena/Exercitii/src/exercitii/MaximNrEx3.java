package exercitii;

import java.util.Scanner;

public class MaximNrEx3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contor = 0;
        int max = 0;

        while (contor < 5) {
            System.out.print("Enter the number = " );
            int nr = in.nextInt();
            if (nr > max) {
                max = nr;
            }
            if (nr > 0) {
                contor++;
            }
        }
        System.out.print("The bigger number is = " + max);
    }

}

