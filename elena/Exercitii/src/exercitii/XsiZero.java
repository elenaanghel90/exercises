package exercitii;

import java.util.Scanner;

public class XsiZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] tablaDeJoc = new int[3][3];
        int coloana;
        int linie;
        int contor = 1;

        while (true) {

            if (contor % 2 == 0) {
                System.out.println(" Player 2 ");
            } else {
                System.out.println(" Player 1 ");

            }
            System.out.print(" Enter the number: ");
            linie = input.nextInt();
            System.out.print(" Enter the number: ");
            coloana = input.nextInt();


            if (nrIntroduseSuntCorecte(coloana, linie)) {

                if (contor % 2 == 0) {
                    tablaDeJoc[linie][coloana] = 2;
                } else {
                    tablaDeJoc[linie][coloana] = 1;
                }
                contor += 1;
                afiseaza(tablaDeJoc);
                if (joculETerminat(tablaDeJoc) != 0) {
                    break;
                }
            }
        }
    }


    public static boolean nrIntroduseSuntCorecte(int coloana, int linie) {
        if (((coloana >= 0) && (coloana <= 2)) && ((linie >= 0) && (linie <= 2))) {
            return true;
        } else {
            return false;
        }
    }

    public static void afiseaza(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] == 0) {
                    System.out.print("   ");
                } else if (matrice[i][j] == 1) {
                    System.out.print(" X ");
                } else if (matrice[i][j] == 2) {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }

    }

    public static int joculETerminat(int[][] matrice) {
        if ((matrice[0][0] == 1 && matrice[0][1] == 1 && matrice[0][2] == 1)
                || (matrice[1][0] == 1 && matrice[1][1] == 1 && matrice[1][2] == 1)
                || (matrice[2][0] == 1 && matrice[2][1] == 1 && matrice[2][2] == 1)
                || (matrice[0][0] == 1 && matrice[1][0] == 1 && matrice[2][0] == 1)
                || (matrice[0][1] == 1 && matrice[1][1] == 1 && matrice[2][1] == 1)
                || (matrice[0][2] == 1 && matrice[1][2] == 1 && matrice[2][2] == 1)
                || (matrice[0][0] == 1 && matrice[1][1] == 1 && matrice[2][2] == 1)
                || (matrice[0][2] == 1 && matrice[1][1] == 1 && matrice[2][0] == 1)) {
            System.out.println(" The winner is player 1!");
            return 1;

        } else if ((matrice[0][0] == 2 && matrice[0][1] == 2 && matrice[0][2] == 2)
                || (matrice[1][0] == 2 && matrice[1][1] == 2 && matrice[1][2] == 2)
                || (matrice[2][0] == 2 && matrice[2][1] == 2 && matrice[2][2] == 2)
                || (matrice[0][0] == 2 && matrice[1][0] == 2 && matrice[2][0] == 2)
                || (matrice[0][1] == 2 && matrice[1][1] == 2 && matrice[2][1] == 2)
                || (matrice[0][2] == 2 && matrice[1][2] == 2 && matrice[2][2] == 2)
                || (matrice[0][0] == 2 && matrice[1][1] == 2 && matrice[2][2] == 2)
                || (matrice[0][2] == 2 && matrice[1][1] == 2 && matrice[2][0] == 2)) {
            System.out.println(" The winner is player 2! ");
            return 2;

        } else if ((matrice[0][0] != 0 && matrice[0][1] != 0 && matrice[0][2] != 0)
                || (matrice[1][0] != 0 && matrice[1][1] != 0 && matrice[1][2] != 0)
                || (matrice[2][0] != 0 && matrice[2][1] != 0 && matrice[2][2] != 0)) {
            System.out.println(" There's no winner !");
            return 3;

        } else {
            return 0;
        }
    }

}



