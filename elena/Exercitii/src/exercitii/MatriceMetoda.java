package exercitii;

public class MatriceMetoda {
    public static void main(String[] args) {
        int[][] mat = {{3, 5, 6, 9}, {5, 9, 8, 8}, {8, 5, 4, 7}};
        afiseazaMatrice(mat);
    }

    public static void afiseazaMatrice(int[][] mat) {

        for (int i = 0; i < mat.length; i++) { //afiseaza linie

            for (int j = 0; j < mat[i].length; j++) {

                System.out.print(mat[i][j] + " ");

            }
            System.out.println();

        }

    }
}
