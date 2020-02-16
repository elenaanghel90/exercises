import java.util.Scanner;

public class Exe2Tema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number a = ");
        int a = input.nextInt();

        System.out.print("Enter the number b = ");
        int b = input.nextInt();

        if (a == b) {
            System.out.println("The entered numbers are equal");
        } else {
            System.out.println("The entered numbers are not equal");
        }

    }
}

