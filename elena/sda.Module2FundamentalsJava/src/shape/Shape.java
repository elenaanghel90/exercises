package shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "negru";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        String s = "The shape is colored in " + this.color;

        if (isFilled()) {
            s += " and is filled";
        } else {
            s += " and is not filled";
        }
        return s;

    }
}
