import java.util.Scanner;

public class Exe3Tema {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("x = ");
        int x = input.nextInt();

        if ((x > a) && (x < b)) {
            System.out.println("The number x is between the values of a and b");
        }
        else {
            System.out.println("The number x isn't between the values of a and b");
        }
    }
}
