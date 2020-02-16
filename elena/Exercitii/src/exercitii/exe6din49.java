package exercitii;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exe6din49 {

    public static void main(String[] args) {
        int[] sir = new int[6];
        Random rand = new Random();
        int x;
        int i, j;

        System.out.println("sir inainte: " +Arrays.toString(sir));
        for (i = 0 ; i < 6; i++ ) {
            do {
                x = rand.nextInt(49) + 1;
                for (j = 0; j < i; j++){
                    if (sir[j] == x){
                        break;
                    }
                }
            }while (i != j);
            sir[i] = x;
        }

        System.out.println("sir dupa: " + Arrays.toString(sir));
    }
}