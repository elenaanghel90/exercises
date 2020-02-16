package noduri;

public class Nod {
    private String valoare;
    private Nod nodUrmator;

    public String getValoare() {
        return valoare;
    }

    public Nod(String valoare) {
        this.valoare = valoare;
    }

    public void setValoare(String valoare) {
        this.valoare = valoare;
    }

    public Nod getNodUrmator() {
        return nodUrmator;
    }

    public void setNodUrmator(Nod nodUrmator) {
        this.nodUrmator = nodUrmator;
    }


}
