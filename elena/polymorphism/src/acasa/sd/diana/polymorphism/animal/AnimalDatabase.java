package acasa.sd.diana.polymorphism.animal;

import java.util.Arrays;
import java.util.List;

public class AnimalDatabase {

    private List<Animal> animals;

    public AnimalDatabase() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal cow = new Cow();
        Animal ciudat = new StrangeAnimal("animalciudat");
        this.animals = Arrays.asList(dog, cat, cow);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
