package exercitii;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SirRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sir = new int[5];
        Random rand = new Random();
        int sum = 0;
        do {
            for (int i = 0; i < sir.length; i++) {
                sir[i] = rand.nextInt(7);
            }
            System.out.print("sir:" + Arrays.toString(sir));
            sum = calculeazaSuma(sir);

            System.out.println("The sum of the array is= " + sum);

        } while (sum <= 15);
    }

    public static int calculeazaSuma(int[] sir) {
        int sum = 0;
        for (int i = 0; i < sir.length; i++) {
            sum += sir[i];
        }
        return sum;

    }
}
