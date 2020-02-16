package exercitii;

import java.util.Scanner;

public class Exe4TemaSapt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduceti cuvantul: ");
        String cuvant = input.nextLine();

        System.out.println("Cuvantul cu litere mari este = " + cuvant.toUpperCase());

        if (cuvant.length() % 2 == 0) {
            String half1 = cuvant.substring(0, (cuvant.length() / 2));
            String half2 = cuvant.substring((cuvant.length() / 2));
            System.out.println(half1 + "-" + half2);
        } else {
            String half1 = cuvant.substring(0, (cuvant.length() / 2));
            String half2 = cuvant.substring((cuvant.length() / 2), (cuvant.length() / 2) + 1);
            String half3 = cuvant.substring((cuvant.length() / 2) + 1);
            System.out.println(half1 + "-" + half2 + "-" + half3);
        }

        for (int i = 0; i < cuvant.length(); i++) {
            System.out.println(cuvant.charAt(i));
        }

    }
}


