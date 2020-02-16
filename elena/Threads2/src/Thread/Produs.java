package Thread;

public class Produs {
    public static Integer counter = 0;
    public static double pret = 0;

    public String nume;
    public Integer id;

    public static Integer nextCounterValue() { //cu synchronized nu pot intra mai multe threaduri in acelasi timp
        return counter++;
    }

    public Produs(String nume) {
        this.nume = nume;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Produs.nextCounterValue();
        Produs branza = new Produs("branza"); //counter se incrementeaza cu 1 si are valoarea 1
        branza.nextCounterValue();
        Produs salam = new Produs("salam"); //counter se incrementeaza cu 1 si are valoarea 2
        Produs.pret = 10; // se atribuie 10 proprietatii pret a CLASEI Produs (nu instantei/obiectului branza)
        salam.pret = 20; // se atribuie 20 proprietatii pret a CLASEI Produs (nu instantei/obiectului salam)
        branza.nume ="branza1";
        salam.nume ="salam1";

        System.out.println("branza = " + branza);
        System.out.println("salam = " + salam);
        System.out.println(branza.pret); // branza.counter == Produs.counter
        System.out.println(salam.pret);
    }

}
