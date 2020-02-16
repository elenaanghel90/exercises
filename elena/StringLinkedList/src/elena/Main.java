package elena;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Lista a = new StringLinkedList();
        a.adaugaElement("Emanuel");
        a.adaugaElement("Elena");
        a.adaugaElement("acasa");

        a.afisareLista();

        a.stergeElement("acasa");

        a.afisareLista();


        Collection lista = new LinkedList();


        lista.size();
    }
}
