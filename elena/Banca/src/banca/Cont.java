package banca;

public class Cont {
    private String iban;
    private Double balanta;

    public Cont(String iban) {
        this.iban = iban; //sau mai poate fi scris setIban(iban);
        balanta = 0d;
    }

    public Cont(String IBAN, Double balanta) {
        setIban(iban);
        setBalanta(balanta);
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Double interogareBalanta() { //getBalanta
        return balanta;
    }

    private void setBalanta(Double balanta) {
        this.balanta = balanta;
    }

    public Double modificareBalanta(Double delta) {
        if (balanta + delta > 0) { //ca sa stim daca putem scoate bani, daca suntem pe 0 nu mai putem scoate bani din cont
            this.balanta += delta;
        }
        return this.balanta;
    }
    @Override
    public String toString(){
        return "{Cont IBAN: " + this.iban +  "}";
    }

}
