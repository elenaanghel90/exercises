package exercitii;

import java.util.Scanner;

public class Exe7TemaSapt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Introduceti numarul = ");
        int numar = input.nextInt();
        boolean Prim = false;
      if(numar <= 1) {
            System.out.println(numar + " nu este prim");
return;
        }

        for (int i = 2; i <= numar / 2; ++i) {

            if (numar % i == 0) {
                Prim = true;
                break;
            }
            ++i;

        }
        if (!Prim) {
            System.out.println(numar + " este prim ");
        } else {
            System.out.println(numar + " nu este prim ");
        }

    }
}


