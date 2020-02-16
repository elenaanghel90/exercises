public class Matrice {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0;  i< mat.length; i++){
            int sumLinie = 0;
            int sumColoane = 0;
            for (int j = 0; j<mat[i].length; j++){
                sumLinie +=mat[i][j];
                sumColoane +=mat[j][i];
               //mat[i][j]*=2; //mat[i][j] =mat[i][j]*2
                if (mat[i][j] % 2  == 1) {
                   //mat[i][j] = 0;
                }

                System.out.print(mat[i][j] + " ");
                            }
            System.out.println("Suma pe linie = " + sumLinie);
            System.out.println("Suma pe coloane = " + sumColoane);
            System.out.println();//new line
        }
    }
    }

