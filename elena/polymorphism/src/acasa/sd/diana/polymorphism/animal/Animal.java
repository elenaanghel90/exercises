package acasa.sd.diana.polymorphism.animal;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String makeNoise();

    @Override
    public String toString() {
        return makeNoise() + " i am a " + this.name;
    }
}
