package acasa.sd.diana.polymorphism.shape;

public class Triangle implements Shape{


    @Override
    public void draw() {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }
}
