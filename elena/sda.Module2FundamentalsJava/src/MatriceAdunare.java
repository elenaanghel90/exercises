import java.util.Scanner;

public class MatriceAdunare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti numarul de randuri: ");
        int m = input.nextInt();
        System.out.print("Introduceti numarul de coloane: ");
        int n = input.nextInt();
        int[][] matrice = new int[n][m];
        int[][] matrice2 = new int[n][m];
        int[][] matriceRezultat = new int[n][m];

        //matrice1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("m[" + i + "] [" + j + " ]=");
                matrice[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        //matrice2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("m[" + n + "] [" + m + " ]=");
                matrice2[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice2[i][j] + " ");
            }
            System.out.println();
        }

        //matricerezultat
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriceRezultat[i][j] = matrice[i][j] + matrice2[i][j];
                System.out.print(matriceRezultat[i][j] + " ");
            }
            System.out.println();
        }

    }
}

