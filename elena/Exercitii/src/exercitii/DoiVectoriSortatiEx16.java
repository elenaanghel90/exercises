package exercitii;

import java.util.Arrays;

public class DoiVectoriSortatiEx16 {
    public static void main(String[] args) {

        int[] sir1 = {2, 3, 7, 9 ,10};
        int[] sir2 = {5, 6, 8, 11, 12, 13};

        System.out.println(" Sirurile concatenate si sortate sunt: " + Arrays.toString(concateneazaSiSorteazaVectorii(sir1, sir2)));
    }

    public static int[] concateneazaSiSorteazaVectorii(int[] sir1, int[] sir2) {
        int[] sirConcatenat = new int[sir1.length + sir2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<sir1.length && j<sir2.length){
            if (sir1[i]<=sir2[j]){
                sirConcatenat[k]=sir1[i];

                i++;
            }
            else {
                sirConcatenat[k] = sir2[j];

                j++;
            }
            k++;
        }
        while(i<sir1.length){
            sirConcatenat[k]= sir1[i];
            k++;
            i++;
        }
        while(j<sir2.length){
            sirConcatenat[k]= sir2[j];
            k++;
            j++;
        }
        return sirConcatenat;
    }


}
