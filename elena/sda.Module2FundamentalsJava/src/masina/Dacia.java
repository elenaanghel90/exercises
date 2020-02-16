package masina;

public class Dacia extends Masina {

    public Dacia(String culoare, int nrRoti) {
        super(culoare, nrRoti);
    }

    @Override
    public void claxoneaza() {
        System.out.println("Claxonez din masina.Dacia!");
    }

    public String toString() {
        return super.toString() + ". Si sunt o " + this.getClass().getName();
    }
}
