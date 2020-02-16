package exercitii;

import java.util.Arrays;
import java.util.Random;

public class exe6din49Var2 {
    public static boolean verifica(int [] sir, int val) {
        for (int j = 0; j < sir.length; j++){
            if (sir[j] == val){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] sir = new int[6];
        Random rand = new Random();
        int x;
        int i, j;

        System.out.println("sir inainte: " + Arrays.toString(sir));
        for (i = 0 ; i < 6; i++ ) {
            do {
                x = rand.nextInt(49) + 1;
            }while (verifica(sir,x));

            sir[i] = x;
        }

        System.out.println("sir dupa: " + Arrays.toString(sir));
    }
}

