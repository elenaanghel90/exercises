package exercitii;

import java.util.Random;

public class MatricePatratEx14 {

    public static void main(String[] args) {
        int[][] matrice = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < matrice.length; i++) {
            System.out.println();
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = rand.nextInt(10);
                if (i == j) {
                    matrice[i][j] = 5;
                }
                if (i == matrice.length-1-j){
                    matrice[i][j] = 9;
                }
                System.out.print(matrice[i][j] + " ");
            }
        }
    }
}
