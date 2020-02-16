package shape;

import java.util.ArrayList;
import java.util.List;

public class AppForme {
    public static void main(String[] args) {
        List<Shape> forme = new ArrayList<>();

        forme.add(new Circle());
        forme.add(new Rectangle());
        forme.add(new Square());
        forme.add(new Square(3, "black", true));
        forme.add(new Rectangle(5.2,3.26, "black", true));
        forme.add(new Circle("red", false, 4));

        for (Shape f : forme) {
            System.out.println(f);
        }
        System.out.println();
        System.out.println("Toate formele care au aria mai mare decat 1: ");

        for (Shape shape : forme) {
            if (shape.getArea() >= 1) {
                System.out.println(shape);
                System.out.println(shape.getArea());
                System.out.println(shape.getPerimeter());
            }
        }
    }
}
