package acasa.sd.diana.polymorphism.animal;

public class StrangeAnimal extends Animal {

    public StrangeAnimal(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "strange sound";
    }
}
