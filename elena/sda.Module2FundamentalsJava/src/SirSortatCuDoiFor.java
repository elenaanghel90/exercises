import java.util.Arrays;

public class SirSortatCuDoiFor {
    public static void main(String[] args) {
        int[] sir = {9, 4, 5, 6, 2, 3, 4};
        int aux;

        for (int i = 1; i < sir.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sir[j] > sir[i]) {
                    aux = sir[j];
                    sir[j] = sir[ i];
                    sir[i] = aux;

                }
            }
        }
        System.out.println(Arrays.toString(sir));

    }
}

