import java.util.Arrays;

public class SirSortatBubbleSort {
    public static void main(String[] args) {

        int[] sir = {9, 4, 5, 6, 2, 3, 4};
        int aux;
        boolean isSort = false;

        while (!isSort) {
            isSort = true;
            for (int i = 0; i < sir.length-1; i++) {
                if (sir[i] > sir[i+1]) {
                    aux = sir[i];
                    sir[i] = sir[i + 1];
                    sir[i + 1] = aux;
                    isSort = false;
                }
            }
        }
        System.out.println(Arrays.toString(sir));

    }
   }


