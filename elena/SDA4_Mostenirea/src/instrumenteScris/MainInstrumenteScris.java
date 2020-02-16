package instrumenteScris;

public class MainInstrumenteScris {
    protected Integer serie;
    protected Double pret;
    protected String culoare;

    public MainInstrumenteScris(Integer serie, Double pret, String culoare) {
        this.serie = serie;
        this.pret = pret;
        this.culoare = culoare;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "{Instrument de scris// : " +
                "serie: " + serie +
                "pret: " + pret +
                "culoare: " + culoare +
                "}";
    }
}
