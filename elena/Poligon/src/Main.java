import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Punct> lista = new LinkedList<>();
        Punct x1 = new Punct(2d, 1d);
        Punct x2 = new Punct(1d, 2d);
        lista.add(x1);
        System.out.println("Patratul se afla la coordonatele: " + x1);
        x1.translatie(1d, 0d);
        System.out.println("Patratul translatat se afla acum la coordonatele : " + x1);

        //Punct punct;
        Double constDeScalare = 2d;
        x1.scalare(constDeScalare);
        System.out.println("Patratul scalat cu valoarea: " + constDeScalare + " se afla acum la coordonatele : " + x1);

        LinkedList<Punct> punctePatrat = new LinkedList<>();
        punctePatrat.add(new Punct(4d, 4d));
        punctePatrat.add(new Punct(8d, 4d));
        punctePatrat.add(new Punct(8d, 8d));
        punctePatrat.add(new Punct(4d, 8d));

        Poligon patrat = new Patrat(punctePatrat);

        patrat.scaleaza(2d);
        System.out.println("Patratul are perimetrul: " + patrat.calculeazaPerimetru());
        System.out.println("Patratul are aria: " + patrat.calculeazaAria());

        LinkedList<Punct> puncteDreptunghi = new LinkedList<>();
        puncteDreptunghi.add(new Punct(4d, 4d));
        puncteDreptunghi.add(new Punct(12d,4d));
        puncteDreptunghi.add(new Punct(12d, 8d));
        puncteDreptunghi.add(new Punct(4d, 8d));

        Poligon dreptunghi = new Dreptunghi(puncteDreptunghi);
        System.out.println("Dreptunghiul are perimetrul: " +dreptunghi.calculeazaPerimetru());
        System.out.println("Dreptunghiul are aria: " +dreptunghi.calculeazaAria());
    }

}
