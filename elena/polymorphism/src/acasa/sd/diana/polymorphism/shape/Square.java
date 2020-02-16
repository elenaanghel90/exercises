package acasa.sd.diana.polymorphism.shape;

public class Square implements Shape{

    public Square() {
    }

    @Override
    public void draw() {
        System.out.println(" ____");
        System.out.println("|    |");
        System.out.println("|____|");
    }
}
