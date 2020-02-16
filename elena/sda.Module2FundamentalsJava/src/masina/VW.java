package masina;

import masina.Masina;

public class VW extends Masina {
    public VW() {
        super("Rosie", 8);
    }

    @Override
    public void parcheaza() {
        System.out.println("Parchez din masina.VW!");
    }

    public String toString() {
        return super.toString()+ ". Si sunt un " + this.getClass().getName();
    }
}
