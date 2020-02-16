package elena;

import java.util.LinkedList;

public class StringLinkedList implements Lista {

    LinkedList<String> list = new LinkedList<>();

    @Override
    public void adaugaElement(String el) {
        list.add(el);
    }

    @Override
    public void stergeElement(String el) {
        list.remove(el);
    }

    @Override
    public void afisareLista() {
        System.out.println(list.toString());
    }
}
