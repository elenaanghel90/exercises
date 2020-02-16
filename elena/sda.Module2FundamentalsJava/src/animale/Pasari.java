package animale;

public class Pasari extends Animal{
    public String fulgi;
    public int inaltime;

    public Pasari(String culoare, String nume, int varsta, String fulgi, int inaltime) {
        super(culoare, nume, varsta);
        this.fulgi = fulgi;
        this.inaltime = inaltime;
    }

    public String getFulgi() {
        return fulgi;
    }

    public void setFulgi(String fulgi) {
        this.fulgi = fulgi;
    }

    public int getInaltime() {
        return inaltime;
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void oua() {

    }

    public void zboara() {

    }
    public String toString() {
        return
                "este un/o " + this.getClass().getSimpleName() + super.toString()+ " cu tipul de fulgi "+ fulgi + " si cu inaltimea " + inaltime;

    }
}
