import java.util.Scanner;

public class MatriceAfisareColoane {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul de randuri: ");
        int m = input.nextInt();
        System.out.print("Introduceti numarul de coloane: ");
        int n = input.nextInt();
        int[][] matrice = new int[n][m];
        int maxim = matrice[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("m[" + i + "] [" + j + " ]=");
                matrice[i][j] = input.nextInt();
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i >= j) {
                    System.out.print(matrice[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i <= j) {
                    System.out.print(matrice[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

