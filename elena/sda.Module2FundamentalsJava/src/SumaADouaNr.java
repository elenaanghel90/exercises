import java.util.Scanner;

public class SumaADouaNr {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Introduceti primul numar = ");
        int x = input.nextInt();
        System.out.print("Introduceti al doilea numar = ");
        int y = input.nextInt();
        int sum ;

        sum = adunaNumerele(x, y);
        System.out.print("Suma celor doua numere este = " + sum);
    }

    private static int adunaNumerele(int x, int y) {
        return x +y;
    }

}
