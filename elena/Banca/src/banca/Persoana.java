package banca;

public abstract class Persoana {
    protected String cnp;
    protected String nume;

    public Persoana(String cnp, String nume){
        this.cnp = cnp;
        this.nume = nume;
    }

    public String getCnp(){
        return cnp;
    }
    public void setCnp(String cnp){
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume){
        this.nume= nume;
    }
}
