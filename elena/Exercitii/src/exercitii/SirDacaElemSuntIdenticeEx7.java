package exercitii;

public class SirDacaElemSuntIdenticeEx7 {
    public static void main(String[] args) {
        int[] sir = {3, 3, 3, 3, 3, 3, 4, 3};
        boolean isIdentical = true;

        for (int i = 0; i < sir.length / 2; i++) {
            if (sir[i] != sir[sir.length - 1 - i]) {
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
