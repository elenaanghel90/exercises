package acasa.sd.diana.polymorphism.animal;

public class Cow extends Animal {

    public Cow() {
        super("cow");
    }

    @Override
    public String makeNoise() {
        return "moo";
    }
}
