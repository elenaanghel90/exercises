package exercitii;

public class SirDacaElemSuntIdentice2Ex7 {

        public static void main(String[] args) {
            int[] sir = {3, 3, 3, 3, 3, 3, 4, 3};
            boolean isIdentical = true;

            for (int i = 0; i < sir.length; i++) {
                if (sir[i] != sir[i+1]) {
                    isIdentical = false;
                    break;
                }
            }
            if (isIdentical) {
                System.out.println(" The elements of the array are identical");
            }
            else {
                System.out.println(" The elements of the array are not identical");
            }
        }
    }


