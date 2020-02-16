package exercitii;

import java.util.Scanner;

public class SumaCifrelorUnuiNrEx6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int nr = in.nextInt();

        int sum = calculeazaSumaCifrelor(nr); // apelam metoda calculeazaSumaCifrelor si salvam rezultatul in variabila sum

        System.out.println(" The sum is = " + sum);
    }

    private static int calculeazaSumaCifrelor(int n) {
        int ultimaCifra;
        int sum = 0;

        while (n > 0) {
            ultimaCifra = n % 10;
            sum += ultimaCifra;
            n = n / 10;
        }

        return sum;
    }

}
