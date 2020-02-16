package exercitii;

import java.util.Scanner;


public class Exe6Tema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int no = input.nextInt();
        int digits = 0;
        int auxNo = no;
        int noOfSpaces;

        while (auxNo != 0) {
            auxNo = auxNo / 10;
            digits++;
        }
        noOfSpaces = 15 - digits;


        int spacesToPrint;

        if (no < 0) {
            if (digits % 2 == 0) {
                spacesToPrint = noOfSpaces / 2;
            } else {
                spacesToPrint = (noOfSpaces / 2) - 1;
            }
            System.out.println("-----------------");
        } else {
            spacesToPrint = noOfSpaces / 2;
            System.out.println("+++++++++++++++++");
        }
        System.out.print("*");
        while (spacesToPrint > 0) {
            spacesToPrint--;
            System.out.print(" ");
        }
        System.out.print(no);


        if (no >= 0) {
            if (digits % 2 == 0) {
                spacesToPrint = (noOfSpaces / 2) + 1;
            } else {
                spacesToPrint = noOfSpaces / 2;

            }
        } else {
            spacesToPrint = noOfSpaces / 2;
        }
        while (spacesToPrint > 0) {
            spacesToPrint--;
            System.out.print(" ");
        }
        System.out.println("*");
        if (no < 0) {
            System.out.println("-----------------");
        } else {
            System.out.println("+++++++++++++++++");
        }

    }
}

