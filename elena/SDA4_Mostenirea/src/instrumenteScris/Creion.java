package instrumenteScris;

public class Creion extends MainInstrumenteScris{
    protected String clase;

    public Creion(Integer serie, Double pret, String culoare, String clase) {
        super(serie, pret, culoare);
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
