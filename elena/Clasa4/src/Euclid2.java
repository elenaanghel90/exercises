import java.util.Scanner;

public class Euclid2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value for a =");
        int a = input.nextInt();

        System.out.print("Enter the value for b = ");
        int b = input.nextInt();

        if (a == b)
            System.out.println("The greatest common denominator is: " + b);


        while (a != 0 && a != b) {
            if (b == 0) {
                System.out.println("The greatest common denominator is: " + a);
                a = 0; //a = 0 pentru a deveni falsa conditia lui while cand introducem de la tastatura valoarea b = 0
            } else {
                if (a > b) {
                    a -= b; //a = a - b
                } else {
                    b -= a;
                }
            }
        }
        if (a > b)
            System.out.println("The greatest common denominator is: " + a);

        else
            System.out.println("The greatest common denominator is: " + b);
    }
}











