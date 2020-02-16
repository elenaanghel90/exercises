package exercitii;

import java.util.Arrays;
import java.util.Random;

public class ExercitiiExtra {
    public static void main(String[] args) {
        String cuvant;
        cuvant = "abc";
        cuvant = new String ("def");
        int n = 5;
        int m = 6;

        for ( int i = 0; i < n-1; i++){

        }
        // i = 4
        int contor = 0;
        for ( int j = 0; j < n; j++){

            for (int k = 0; k < m; k++){
                contor++;
            }
        }
        System.out.println(contor); //30

     int [][] matrice = new int [3][2];
        Random rand = new Random();

        for (int i = 0; i < matrice.length; i++){
            for (int j = 0; j <matrice[i].length; j++){
                matrice[i][j] = rand.nextInt(10);
            }
            System.out.println(Arrays.toString(matrice[i]));
        }
    }
}
