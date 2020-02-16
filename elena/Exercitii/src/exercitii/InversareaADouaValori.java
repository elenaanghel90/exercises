package exercitii;

import java.util.Scanner;

public class InversareaADouaValori {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui a=");
        int a = input.nextInt();
        System.out.println("Introduceti valoarea lui b=");
        int b = input.nextInt();

        int c;

        c=a;
        a=b;
        b=c;
        System.out.println("Valoarea noua a lui a =" + a);
        System.out.println("Valoarea noua a lui b =" + b);

    }
        }
