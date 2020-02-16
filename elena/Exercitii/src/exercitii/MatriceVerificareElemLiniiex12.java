package exercitii;

import java.util.Scanner;

public class MatriceVerificareElemLiniiex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrice = {{3, 6, 5}, {5, 2, 1}, {4, 9, 8}};

        System.out.print("Introduceti nr liniei pe care vreti sa il verificati : ");
        int linie = input.nextInt();

        if (elementeIdentice(matrice, linie)) {
            System.out.println("Elementele de pe linie sunt identice");
        } else {
            System.out.println("Elementele de pe linie nu sunt identice");
        }
    }

    public static boolean elementeIdentice(int[][] matrice, int linie) {
        boolean isIdentical = true;
        for (int i = 0; i < matrice[linie].length-1; i++) {

            if (matrice[linie][i] != matrice[linie][i + 1]) {
                isIdentical = false;

            }
        }
        return isIdentical;
    }

}

