public class Fotbalist extends Sportiv {
    private Float viteza;
    private String rol;
    private Integer valoare;

    public Fotbalist(Integer inaltime, Integer greutate, String nume, Float viteza, String rol, Integer valoare) {
        super(inaltime, greutate, nume);
        setViteza(viteza);
        setRol(rol);
        setValoare(valoare);
    }

    public void setViteza(Float viteza) {
        this.viteza = viteza;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getValoare() {
        return valoare;
    }

    public void setValoare(Integer valoare) {
        this.valoare = valoare;
    }

    public Float getViteza() {
        return viteza;
    }
}
