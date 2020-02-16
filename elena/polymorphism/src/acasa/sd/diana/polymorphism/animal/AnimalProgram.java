package acasa.sd.diana.polymorphism.animal;

public class AnimalProgram {

    public static void main(String[] args) {
        AnimalDatabase animalDatabase = new AnimalDatabase();

        System.out.print("Listen, we can hear all the animals in the database: ");
        for (Animal animal : animalDatabase.getAnimals()) {
            System.out.print(animal.makeNoise());
            System.out.print(" ");
        }

    }
}
