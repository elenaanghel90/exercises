package Hoteluri;

public class Persoana{
    private String nume;
    private String CNP;

    public Persoana(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    @Override
    public String toString(){
        return "Nume: " + this.nume;
    }
}

