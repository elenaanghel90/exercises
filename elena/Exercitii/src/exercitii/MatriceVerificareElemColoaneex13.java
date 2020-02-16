package exercitii;

import java.util.Scanner;

public class MatriceVerificareElemColoaneex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrice = {
              // 0  1  2
                {4, 4, 4}, /*0*/
                {5, 6, 4}, /*1*/
                {4, 9, 4}, /*2*/
                {6, 3, 4}  /*3*/
        };

        System.out.print("Introduceti nr coloanei pe care vreti sa il verificati : ");
        int coloana = input.nextInt();

        if (elementeIdentice(matrice, coloana)) {
            System.out.println("Elementele de pe coloana sunt identice");
        } else {
            System.out.println("Elementele de pe coloana nu sunt identice");
        }
    }

    public static boolean elementeIdentice(int[][] matrice, int coloana) {
        boolean isIdentical = true;
        for (int i = 0; i < matrice.length-1; i++) {

            if (matrice[i][coloana] != matrice[i + 1][coloana]) {
                isIdentical = false;

            }
        }
        return isIdentical;
    }

}
