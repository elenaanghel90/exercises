package exercitii;


import java.util.Arrays;
import java.util.Scanner;

public class Exe6TemaSapt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");

        int length = input.nextInt();
        int[] arrayOfInts = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter array element [" + i + "] = ");
            arrayOfInts[i] = input.nextInt();
        }
        System.out.println("The array is: " + Arrays.toString(arrayOfInts));

        int lastNumber;
        lastNumber = arrayOfInts[arrayOfInts.length - 1];

        for (int i = 0; i < (arrayOfInts.length - 1); i++) {
            if (arrayOfInts[i] % lastNumber == 0) {
                System.out.println(" The number " + arrayOfInts[i] + " is multiple of " + lastNumber);
            }

        }
    }
}
