package com.sda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main
{
	public static void main(String[] args)
	{
		List<Point> points = new ArrayList<>();
		points.add(new Point(0, 1));
		points.add(new Point(2, 1));
		points.add(new Point(-1, 1));
		points.add(new Point(-1, -5));
		points.add(new Point(3, 1));
		
		Stream<Point> pointStream = points.stream();
		Point res = pointStream.filter(p -> p.x < 0).findFirst().get();
		//System.out.println(res);
		//System.out.println("========================");
		
		Stream<Point> pointStream2 = points.stream();
		Function<Point, Point> scaleBy2 = e -> 
			{
				e.x *= 2;
				e.y *= 2;
				return e;
			};
		Function<Point,Point> scaleByHalf = r ->
			{
				r.x /= 2;
				r.y /= 2;
				return r;
			};
		//pointStream2.map(scaleBy2).forEach(System.out::println);
		
		Stream<Point> averageXStream = points.stream();
		Double averageX = averageXStream.mapToInt(p -> p.x).average().getAsDouble();
		//System.out.println("AverageX: "+averageX);
		
		Comparator<Point> comparator = (p,q) -> {
			Integer d1 = p.x*p.x + p.y*p.y;
			Integer d2 = q.x*q.x + q.y*q.y;
			return d1-d2;
		};
		
		//points.stream().sorted().forEach(System.out::println);
		
		Point p = points.stream().reduce(new Point(0,0),
				(currentVal, el) -> {
					currentVal.x += el.x;
					currentVal.y += el.y;
					return currentVal;
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
		
		List<String> strings = new ArrayList<>();
		strings.add("Rand1");
		strings.add("Test");
		strings.add("Ceva");
		
		String res2 = strings.stream().reduce("",
				(currentVal, el) -> {
					if(!currentVal.equals(""))
					{
						String r= currentVal+", "+ el ;
						return r;
					}
					else
					{
						return el;
					}
				}
		);
		System.out.println(res2);
		/*
		currentVal		el		ret
		""
		 */
	}
}
