package exercitii;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenerareNrRandom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//genereaza numere aleatorii
        in.close(); //inchidem scannerul
        int[] sir = new int[n];
        Random rand = new Random();

        System.out.println("sir:" + Arrays.toString(sir));

        for (int i = 0; i<n;i++) {

            sir[i]=rand.nextInt(20);//ce declari in paranteze afiseaza numere cu valoarea pana in valoarea dintre paranteze
            //System.out.print(rand.nextInt(10) + ";");

            sir[i]=(int)(Math.random() *50);//metoda Math ne afiseaza numerele intre 0 si 1 si pentru a putea face cast pe aceasta trebuie sa fie mai mare decat intre 0 si 1
       //se afiseaza doar al doilea sir, ca il sterge pe primul
        }
        System.out.println("sir:" + Arrays.toString(sir));
    }
}
