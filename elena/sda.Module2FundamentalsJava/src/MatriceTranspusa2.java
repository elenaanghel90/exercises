import java.util.Scanner;

public class MatriceTranspusa2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numarul de randuri: ");
        int m = input.nextInt();
        System.out.print("Introduceti numarul de coloane: ");
        int n = input.nextInt();
        int[][] matrice = new int[n][m];


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
        for (int j = matrice.length-1 ; j >=0 ; j--) {
            for (int i = 0 ; i < matrice[j].length; i++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
