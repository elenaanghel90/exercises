package exercitii;

import java.util.Arrays;
import java.util.Scanner;

public class Exe8TemaSapt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");

        int length = input.nextInt();
        int[] arrayOfInts = new int[length];
        arrayOfInts[0] = 0;
        arrayOfInts[1] = 1;
        for (int i = 2; i < length; i++) {
            arrayOfInts[i] = arrayOfInts[i-1]+ arrayOfInts[i-2];



        }System.out.print("The Fibanacci serie is: "+ Arrays.toString(arrayOfInts)); //Arrays.toString returneaza un string  care contine o lista de elemente ale vectorului
    }
}

