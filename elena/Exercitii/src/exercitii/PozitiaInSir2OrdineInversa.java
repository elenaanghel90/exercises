package exercitii;

import java.util.Arrays;
import java.util.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PozitiaInSir2OrdineInversa {
    public static void main(String[] args) {

        int[] arrayOfInts = {10, 15, 20, 25, 30, 15, 15, 20};
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti n:");
        int nr = in.nextInt();
        // int contor = 0;
        int i;
        System.out.println( "Sirul e: " + Arrays.toString (arrayOfInts)); //un alt mod de afisare a sirului in ordine inversa

        System.out.println("Afisare in ordine inversa:");
        for (i = arrayOfInts.length - 1 ; i >= 0; i--) {
            System.out.println("array[" + i + "] = " + arrayOfInts[i]);
        }

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == nr) {
                //contor++;
                //System.out.println("Pozitia e: " + i);
                break;
            }
        }
        System.out.println("i = " + i);
        if (i == arrayOfInts.length){
            System.out.println("Nu se afla in sir!");
        }
        else {
            System.out.println("Pozitia e: " + i);
        }

        System.out.println("La revedere!");

  /*      if (contor > 0) {
            System.out.println("Numarul: " + nr +
                    " se regaseste in sir de " + contor + " ori!");
        }
        else{
            System.out.println("Nu se regaseste in sir");
        }*/
    }
}