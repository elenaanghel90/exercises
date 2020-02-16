package persoane;

public class Profesor extends Persoana {
    String grad;
    String materie;
    public Profesor(String nume, String prenume, int varsta, String studii){
        super(nume,prenume, varsta, studii);
    }


    public void Profesor(String grad, String materie){
        this.grad = grad;
        this.materie = materie;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String toString(){
        return super.toString() + " preda " + this.materie + " si are gradul de " + this.grad;
    }

}
