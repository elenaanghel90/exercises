package exercitii;


import java.util.Scanner;

public class Exe10TemaSapt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Introduceti cuvantul: ");
        String cuvant = input.nextLine();
        String cuvantInvers = "";


        for (int i = cuvant.length() - 1 ; i >= 0; i--) {
            System.out.println( " Cuvantul in ordine inversa e:" +cuvant.charAt(i));
            cuvantInvers += cuvant.charAt(i);
        }
        System.out.println(" Cuvantul scris invers e:" + cuvantInvers);

if (cuvant.equals(cuvantInvers)){
    System.out.println( "Cuvantul " + cuvant + " introdus este palindrom");
}
else {
    System.out.println( "Cuvantul " + cuvant + " introdus nu este palindrom");
}
    }
}
