package Streamuri;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 1));
        points.add(new Point(2, 1));
        points.add(new Point(-1, 1));
        points.add(new Point(-1, -5));
        points.add(new Point(3, 1));

        Stream<Point> pointStream = points.stream();//convertire unei liste la un stream
        Point res = pointStream.filter(p -> p.x < 0).findFirst().get();//primul numar negativ din lista
        System.out.println(res);

//        Point res1 = pointStream.filter(p -> p.x < 0).findAny().get();//primul/ oricare numar negativ din lista, dar nu garanteaza ca il ia primul
//        System.out.println(res1);

        System.out.println("======= Urmeaza Scalarea");
        Stream<Point> pointStream2 = points.stream();

        Function<Point, Point> scaleBy2 = e -> //scalam cu 2
        {
            e.x *= 2;
            e.y *= 2;
            return e;
        };
        Stream<Point> pointStream3 = points.stream();
        Function<Point, Point> scaleByHalf = r -> //impartim la 2
        {
            r.x /= 2;
            r.y /= 2;
            return r;
        };
        pointStream3.map(scaleBy2).forEach(System.out::println);
        System.out.println();
        pointStream2.map(scaleByHalf).forEach(System.out::println);

        System.out.println("======Urmeaza calculul mediei punctelor x si y");
        Stream<Point> averageXStream = points.stream(); //media punctelor x
        Double averageX = averageXStream.mapToInt(p -> p.x).average().getAsDouble();
        System.out.println("AverageX: " + averageX);

        Stream<Point> averageYStream = points.stream(); //media punctelor y
        Double averageY = averageYStream.mapToInt(p -> p.y).average().getAsDouble();
        System.out.println("AverageY: " + averageY);

        System.out.println("=======Urmeaza sortare in functie de distanta pana la origine");
        Comparator<Point> comparator = (p, q) -> {//se scrie cu paranteze ca lambda expresii trebuiesc scrise in paranteze daca avem mai multe de un param
            Integer d1 = p.x * p.x + p.y * p.y;
            Integer d2 = q.x * q.x + q.y * q.y;
            return d1 - d2;
        };
        //points.stream().sorted(comparator).forEach(System.out::println);
        points.stream().sorted(comparator).forEach(System.out::println);

        System.out.println("=======Urmeaza adunarea punctelor x si y cu pucntul dat de noi cu metoda reduce");

        Point p = points.stream().reduce(new Point(0, 0), (currentValue, el) -> {//curentValue elementul dat de noi (adica Point 0), si el - elementul din stream
                    currentValue.x += el.x;
                    currentValue.y += el.y;
                    return currentValue;
                }
        );
        System.out.println(p);
     		/*
		currentValue  	el		ret
		0,0				0,1		0,1
		0,1				2,1		2,2
		2,2				-1,1	1,3
		1,3				-1,-5	0,-2
		0,-2			3,1		3,-1
		 */

        System.out.println("=======Metoda reduce pe lista de Stringuri");
        List<String> strings = new ArrayList<>();
        strings.add("Rand2");
        strings.add("Titlu");
        strings.add("Ceva");



        String res2 = strings.stream().reduce("",
                (currentValue, el) -> {
                    if (!currentValue.equals("")) {//am fi avut probleme ca afisam o virgula in plus la inceput
                        String r = currentValue + ", " + el;
                        return r;
                    } else {
                        return el;
                    }
                }
        );
        System.out.println(res2);

       /*currentVal     el     ret
       ""              Rand
        */
    }
}
