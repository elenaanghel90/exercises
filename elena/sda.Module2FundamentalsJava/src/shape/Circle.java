package shape;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        this.color = "alb";
        this.filled = true;
        this.radius = 0;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + " and has the radius: " + this.radius;
    }
}
