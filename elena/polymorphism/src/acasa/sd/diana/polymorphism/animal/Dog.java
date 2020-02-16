package acasa.sd.diana.polymorphism.animal;

public class Dog extends Animal {

    public Dog() {
        super("dog");
    }

    @Override
    public String makeNoise() {
        return "ham";
    }
}
