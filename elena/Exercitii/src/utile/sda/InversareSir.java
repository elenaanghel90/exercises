package utile.sda;

import java.util.Arrays;

public class InversareSir {
    public static void main(String[] args) {
        int[] sir = {3, 6, 66, 72, 1};

        int stockNo;

        System.out.println("sir: " + Arrays.toString(sir));
        for (int i = 0; i< sir.length/2; i++) {
            stockNo = sir[i];
            sir[i]=sir[sir.length -1-i];
            sir[sir.length -1-i]=stockNo;
        }
        System.out.println("sir: " + Arrays.toString(sir));
        }


    }

