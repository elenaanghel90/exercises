package persoane;

import persoane.Persoana;

public class Student extends Persoana {
    String specialitate;
    String scoala;
    int grupa;

    public Student(String nume, String prenume, int varsta, String studii) {
        super(nume, prenume, varsta, studii);

    }

    public String getSpecialitate() {
        return specialitate;
    }

    public void setSpecialitate(String specialitate) {
        this.specialitate = specialitate;
    }

    public String getScoala() {
        return scoala;
    }

    public void setScoala(String scoala) {
        this.scoala = scoala;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    public void Student(String Specialitate, String Scoala, int Grupa) {
        this.scoala = Scoala;
        this.grupa = Grupa;
        this.specialitate = Specialitate;
    }

    public String toString() {
        return super.toString() + " si studiaza " + this.specialitate + " la grupa " + this.grupa + " la scoala " + this.scoala;
    }

}
