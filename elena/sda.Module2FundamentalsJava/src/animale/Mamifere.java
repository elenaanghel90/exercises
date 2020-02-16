package animale;

public class Mamifere extends Animal {
    private String blana;
    private int nrPicioare;

    public Mamifere(String culoare, String nume, int varsta, String blana, int nrPicioare) {
        super(culoare, nume, varsta);
        this.blana = blana;
        this.nrPicioare = nrPicioare;
    }

    public String getBlana() {
        return blana;
    }

    public void setBlana(String blana) {
        this.blana = blana;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public void alearga() {

    }

    public void naste() {

    }

    public String toString() {
        return "este un/o " + "" + super.toString()+ " cu tipul de blana "+ blana + " si un cu numar de picioare " + nrPicioare;
        //
    }

}