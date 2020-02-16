package exercitii;

import java.util.Random;
import java.util.Scanner;

public class MatriceNrLiniiColoaneEx11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Introduceti nr de linii = ");
        int nrLinii= input.nextInt();
        System.out.print("Introduceti nr de coloane = ");
        int nrColoane=input.nextInt();
        int[][] matrice = new int[nrLinii][nrColoane];
        Random rand = new Random();

        for (int linie = 0; linie < nrLinii;linie++){
            System.out.println();
            for (int coloana = 0 ; coloana < nrColoane; coloana++) {
                matrice[linie][coloana] = rand.nextInt(10) + 1;//porneste de la 0 pana la 9 si mai adaugam +1 ca sa porneasca de la 1
                System.out.print( matrice[linie][coloana] + " " );
            }
        }
    }
}
