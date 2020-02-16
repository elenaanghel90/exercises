import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public abstract class Poligon {
    public static final Double Tolerance = 0.00000001;
    protected List<Point> points = new LinkedList<>();

    public void scale(Double s) {
        for (Point x : points) {
            x.scale(s);
        }
    }

    public void translate(Double dx, Double dy) {
        for (Point x : points) {
            x.translate(dx, dy);
        }
    }

    public abstract Double getArea();

    public abstract void paint(Graphics g);

    public Double getPerimeter() throws Exception {
        Double perimeter = 0d;
        if (points.size() < 3) {
            throw new Exception("Nu e un poligon ");
        }
        for (int i = 0; i < points.size() - 1; ++i) {
            Point a = points.get(i);
            Point b = points.get(i + 1);
            perimeter += distance(a, b);
        }
        perimeter += distance(points.get(0), points.get(points.size() - 1));
        return perimeter;
    }

    protected Double distance(Point a, Point b) {
        Double dy = b.getY() - a.getY();
        Double dx = b.getX() - a.getX();
        return Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0));
    }
}

