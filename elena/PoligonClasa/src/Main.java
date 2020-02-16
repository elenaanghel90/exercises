import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> punctePatrat = new ArrayList<>(4);
        punctePatrat.add(new Point(0d, 0d));
        punctePatrat.add(new Point(0d, 50d));
        punctePatrat.add(new Point(50d, 50d));
        punctePatrat.add(new Point(50d, 0d));

        try {
            Poligon patrat1 = new Patrat(punctePatrat);
            System.out.println("Perimetru " + patrat1.getPerimeter());
            System.out.println("Aria " + patrat1.getArea());
            BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
            Graphics imageGraphics = image.getGraphics();
            patrat1.paint(imageGraphics);
            File output = new File("poligon.png");
            ImageIO.write(image, "png", output );

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
