package exercitii;

import java.util.Scanner;

public class Exe4Tema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year = ");
        int year = input.nextInt();

        if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)) { //un an este bisect dacă este divizibil cu 4, exceptând cazurile când este divizibil cu 100 fără a fi divizibil cu 400
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }

    }
}
