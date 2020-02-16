package exercitii;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(3); // next ia primul cuvant
        String dd = input.nextLine(); //nextLine ia prima linie
        System.out.println("caracter = " + dd);

    }
}
