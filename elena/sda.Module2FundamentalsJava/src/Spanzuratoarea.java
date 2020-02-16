import java.util.Scanner;

public class Spanzuratoarea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti cuvantul: ");
        String cuvant = input.nextLine();
        StringBuilder ghiciCuv = new StringBuilder();
        int incercari = 0;

        for (int i = 0; i < cuvant.length(); i++) {
            ghiciCuv.append('_');
        }
        while (!cuvant.equals(ghiciCuv.toString())) {
            System.out.println(ghiciCuv);
            System.out.println(" Introduceti un caracter din cuvant: ");
            char c = input.next().charAt(0);

            for (int i = 0; i < cuvant.length(); i++) {
                if (cuvant.charAt(i) == c) {
                    ghiciCuv.setCharAt(i, c);
                }
                incercari++;
            }
        }
        System.out.println(cuvant);
    }
}


