import java.util.Scanner;

public class StringCuvOrdineLitere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text;
        do {
            System.out.print("\nIntroduceti text: ");

            text = in.nextLine();
            if (!text.equals("quit")) {

                //String text = "Emanuel";
                //System.out.println("lungime = " + text.length());
                //System.out.println("A 2-a litera e: " + text.charAt(1) + " ' ");
                int i;
                System.out.print("Cuvantul " + text + " in ordine inversa e = ");

                for (i = text.length() - 1; i >= 0; i--) {
                    System.out.print(text.charAt(i));
                }
            }
        }
            while (!text.equals("quit")) ;


    }
}

