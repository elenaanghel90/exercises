package instrumenteScris;

public class Carioca extends MainInstrumenteScris{
    protected boolean refillable;

    public Carioca(Integer serie, Double pret, String culoare, boolean refillable) {
        super(serie, pret, culoare);
        this.refillable = refillable;
    }

    public boolean isRefillable() {
        return refillable;
    }

    public void setRefillable(boolean refillable) {
        this.refillable = refillable;
    }

}
