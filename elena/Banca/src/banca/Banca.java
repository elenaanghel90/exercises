package banca;

import java.util.LinkedList;

public class Banca {
    private LinkedList<Client> client;
    private LinkedList<Angajat> angajati;

    public Banca(){
        client = new LinkedList<>();
        angajati = new LinkedList<>();

    }

    public void adaugaAngajat(Angajat a){
        this.angajati.add(a);
    }
    public void stergeAngajat(Angajat a){
        this.angajati.remove(a); //remove cauta un obiect si il sterge din lista
    }
    public void stergeAngajat(String cnp){
        for(int i = 0; i <this.angajati.size(); ++i)
        {
            if(this.angajati.get(i).getCnp().equals(cnp)){

            }
        }
    }
}
