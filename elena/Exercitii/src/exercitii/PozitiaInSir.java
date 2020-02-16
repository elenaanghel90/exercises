package exercitii;

import java.util.Scanner;

public class PozitiaInSir {

    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30, 15, 15, 20};
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti n = ");
        int nr = in.nextInt();
        int contor = 0;

        for (int i = 0; i < arrayOfInts.length; i++) { //i++ = i+=1
            if (arrayOfInts[i] == nr) {
                contor++;

            }

            if (arrayOfInts[i] == nr) {
                System.out.println("Numarul :" + nr + " se regaseste in sir in pozitia " + i);
                break;
            }
        }
        if (contor == 0) {
            System.out.println(" Numarul nu se regaseste in sir ");
        }
        System.out.println("Numarul : "+nr+" se regaseste in sir de "+contor+" ori! ");
    }
    //System.out.println("La revedere");
    //return;
}




