package persoane;

public class Persoana {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected String studii;


    public Persoana(){
        this.nume = "Marian";
        this.prenume = "Profesor";
        this.varsta = 30;
        this.studii = "Chimie";
    }
    public Persoana(String nume, String prenume, int varsta, String studii){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.studii = studii;
    }
    public void studiaza(){
    }
    public void preda(){
    }
    public String toString(){
        return "Persoana " + this.nume + this.prenume + " are varsta " + this.varsta + " cu studiile " + this.studii;
    }

}
