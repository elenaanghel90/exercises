package acasa.sd.diana.polymorphism.shape;

public class Rectangle implements Shape{


    @Override
    public void draw() {
        System.out.println(" ____");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("|____|");
    }
}
