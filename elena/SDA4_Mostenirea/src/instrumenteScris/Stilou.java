package instrumenteScris;

public class Stilou extends MainInstrumenteScris {
    protected String materialPenita;

    public Stilou(Integer serie, Double pret, String culoare, String materialPenita) {
        super(serie, pret, culoare);
        this.materialPenita = materialPenita;
    }

    public String getMaterialPenita() {
        return materialPenita;
    }

    public void setMaterialPenita(String materialPenita) {
        this.materialPenita = materialPenita;
    }

    @Override
    public String toString() {
        return "{Stilou// " + super.toString() +
                " materialPenita: " + materialPenita +
                "}";

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof String)) {//prima comparatie
            return false;
        }
        Stilou celalaltStilou = (Stilou) obj; //cast
        if (!celalaltStilou.materialPenita.equals(materialPenita)) {
            return false;
        }
        if (!celalaltStilou.serie.equals(serie)) {
            return false;
        }
        if (!celalaltStilou.culoare.equals(culoare)) {
            return false;
        }
        if (!celalaltStilou.pret.equals(pret)) {
            return false;
        }
        return true;
    }

}
