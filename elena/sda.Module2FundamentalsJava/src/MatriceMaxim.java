import java.util.Scanner;

public class MatriceMaxim {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numarul de randuri: ");
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
                if (maxim < matrice[i][j]) {
                    maxim = matrice[i][j];
                }
            }
        }
        System.out.println("Maximul este = " + maxim);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
