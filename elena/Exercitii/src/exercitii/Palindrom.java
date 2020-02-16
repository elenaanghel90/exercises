package exercitii;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti cuvant: ");
        String cuvant = in.nextLine();
        int i;
        boolean flag = true;

        for (i = 0; i < cuvant.length()/2; i++){
            if (cuvant.charAt(i) != cuvant.charAt(cuvant.length() - 1 - i)){
                System.out.println("cuvantul: " + cuvant + " nu e palindrom");
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("cuvantul: " +
                    cuvant + " e palindrom");
        }
    }
}

