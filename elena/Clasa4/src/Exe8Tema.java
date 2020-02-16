import java.util.Scanner;

public class Exe8Tema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number a = ");
        int a = input.nextInt();
        System.out.print("Enter the number b = ");
        int b = input.nextInt();

        int mean;
        mean = (a+b)/2;
        System.out.print("The arithmetic mean is = " + mean);


    }

}