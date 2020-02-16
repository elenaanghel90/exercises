package acasa.sd.diana.polymorphism.animal;

public class Cat extends Animal {

    public Cat() {
        super("cat");
    }

    @Override
    public String makeNoise() {
        return "meow";
    }
}
