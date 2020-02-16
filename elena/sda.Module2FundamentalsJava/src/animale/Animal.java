package animale;

public class Animal {
    private String culoare;
    private String nume;
    private int varsta;

    public Animal(String culoare, String nume, int varsta){
        this.culoare = culoare;
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void alearga(){
    }
    public void mananca(){
    }

    @Override
    public String toString(){
        return "Animalul are culoare "+ culoare + " " + " , numele "+ nume + " ,varsta " + varsta;

    }
}
