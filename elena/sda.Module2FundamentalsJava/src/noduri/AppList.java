package noduri;

import java.util.Scanner;

public class AppList {
    public static void main(String[] args) {

        ListNoduri lista = new ListNoduri();
        String cuvant = "";

        while (!cuvant.equals("/s")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Introduceti un nume sau / s pentru a termina de adaugat  ");
            cuvant = input.nextLine();
            //System.out.println(cuvant);
            if (cuvant.equalsIgnoreCase("/s")) {
                break;
            }

            lista.add(cuvant);
        }
        parcurgere(lista);

        lista.remove("a");

        parcurgere(lista);


    }
    public static void parcurgere(ListNoduri lista){
        Nod nod = lista.getPrimul();
        int i = 1;
        while (nod != null) {
            System.out.println("Elementul: " + i + " este: " + nod.getValoare());
            nod = nod.getNodUrmator();
            i++;
        }

        System.out.println("Avem in total " + (i - 1) + " elemente");
    }

}





