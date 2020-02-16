package exercitii;

import java.util.Arrays;

public class Concatenare2VectoriEx15 {
    public static void main(String[] args) {
        int[] sir1 = {3, 5, 7, 9};
        int[] sir2 = {3, 5, 7, 9, 7};

        System.out.println("Vectorii concatenati sunt = " + Arrays.toString(concateneazaVectorii(sir1, sir2)));
    }

    public static int[] concateneazaVectorii(int[] sirX, int[] sirY) {
        int[] sirConcatenat = new int[sirX.length + sirY.length];
        for (int i = 0; i < sirX.length; i++) {
            sirConcatenat[i] = sirX[i];
        }
        for (int j = 0; j < sirY.length; j++) {
            sirConcatenat[j + sirX.length]  = sirY[j];
        }
        return sirConcatenat;

    }
}
