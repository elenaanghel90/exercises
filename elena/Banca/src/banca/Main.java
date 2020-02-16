package banca;

public class Main {

    public static void main(String[] args) {

        Client c = new Client("1910223284578", "Elena");
        Angajat angajat1 = new Angajat("13221566978", "ionescu", "Asistent clienti", 123);
        Banca b = new Banca();
        Angajat angajat2 = new Angajat("132547468658", "ionescu", "Director", 123);
        //a.deschideCont(c);
        Double suma = 100d;

        b.adaugaAngajat(angajat1);
        b.adaugaAngajat(angajat2);
        System.out.println(b);
        b.stergeAngajat("1");
        System.out.println(b);
        b.stergeAngajat(
                new Angajat("2","", "Agent vanzari", 2563));
        System.out.println(b);
        c.alimentareCont(suma);
        System.out.println("Suma din cont este: " + c.getCont().interogareBalanta());

        c.retrageBani(20d);
        System.out.println("Suma din cont este: " + c.getCont().interogareBalanta());


    }
}
