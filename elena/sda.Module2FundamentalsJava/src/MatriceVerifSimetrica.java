public class MatriceVerifSimetrica {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3},
                {2, 5, 6},
                {3, 6, 9}};

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (matrice[i][j] != matrice[j][i]) {
                    System.out.println("Matricea nu este simetrica");
                } else {
                    System.out.println("Matricea este simetrica");
                    return;
                }

            }
        }
    }
}

