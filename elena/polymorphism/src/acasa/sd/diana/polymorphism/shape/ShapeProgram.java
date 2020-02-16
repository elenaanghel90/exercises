package acasa.sd.diana.polymorphism.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeProgram {
    public static void main(String[] args) {

        Shape square = new Square();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        System.out.println("Print one by one manually ");
        square.draw();
        triangle.draw();
        rectangle.draw();


        System.out.println("Print one by one using a for loop and the interface as List type");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(square);
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
