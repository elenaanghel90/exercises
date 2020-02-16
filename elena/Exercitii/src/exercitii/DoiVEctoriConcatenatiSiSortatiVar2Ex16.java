package exercitii;

import java.util.Arrays;

public class DoiVEctoriConcatenatiSiSortatiVar2Ex16 {

    public static void main(String[] args) {

        int[] sir1 = {2, 10, 0, 3};
        int[] sir2 = {5, 9, 8, 6};

        System.out.println(" Sirurile concatenate si sortate sunt: " + Arrays.toString(concateneazaSiSorteazaVectorii(sir1, sir2)));
    }

    public static int[] concateneazaSiSorteazaVectorii(int[] sir1, int[] sir2) {
        int[] sirConcatenat = new int[sir1.length + sir2.length];

        Arrays.sort(sir1);
        System.arraycopy(sir1, 0, sirConcatenat, 0, sir1.length);

        Arrays.sort(sir2);
        System.arraycopy(sir2, 0, sirConcatenat, sir1.length, sir2.length);

        Arrays.sort(sirConcatenat);
        return sirConcatenat;

    }


}

