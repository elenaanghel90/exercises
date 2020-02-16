package utile.sda;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti n: ");
        int n = in.nextInt();

        System.out.println(n + " != " + factorialClasic(n));
        System.out.println("------------------");
        System.out.println(n + " != " + factorialRecursiv(n));
        System.out.println(("3x4= " + produs(3,4)));
        System.out.println(("7x8= " + produs(7,8)));
    }

    static int produs (int a, int b)
    {
        return a * b;
    }

    static int factorialRecursiv(int nr) { //ca la un bloc, daca trebuie sa urci de la et 1 la etajul 4, trebuie sa urci intai la et 1, si ca sa ajungi la etajul 2, trebuie sa urci la 1 + 1 etaj..caiet
        if (nr ==1){
            return 1;
        }
        else {
            return (factorialRecursiv(nr-1)*nr);
        }
    }
    static int factorialClasic (int nr){
        int rezultat = 1;
        for (int i=2; i<=nr; i++)
        {
            rezultat *=i;
        }
        return rezultat;
    }
}
