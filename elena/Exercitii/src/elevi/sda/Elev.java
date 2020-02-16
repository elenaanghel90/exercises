package elevi.sda;

import utile.sda.Bicicleta;

public class Elev {
    String nume;

    private int notaRomana;
    private int notaMate;
    Bicicleta bike;
    public static int nrElevi;

    public void setBike(String prod, String cul, int greutate){ //nu e public si trebuie sa accesez o metoda ca sa il fac public
        this.bike = new Bicicleta(prod, greutate, cul);

    }
public String bikeToString(){
        return(this.bike.myString());
}
    public String getNume(){
        return nume;
    }

    public Elev(String numeElev) {
        this.nume = numeElev;
        nrElevi++;
    }


    public int getNotaRomana() {
        return notaRomana;
    }

    public void setNotaRomana(int notaRomana) {
        this.notaRomana = notaRomana;
    }

    public int getNotaMate() {
        return notaMate;
    }

    public void setNotaMate(int notaMate) {
        this.notaMate = notaMate;
    }

    public float medie() {
        return ((float) (notaMate + notaRomana) / 2);

    }
}