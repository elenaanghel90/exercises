package utile.sda;

import java.util.Scanner;
import java.io.Console;
//calculeaza cat dureaza o executie, in timp


public class StringCompare {

    public static void main(String[] args) {
        int nr = 100000;

        long x = stressStringTest(nr);
        System.out.println(x);

        long y = stressBuilderTest(nr);
        System.out.println(y);
    }


    public static long stressStringTest(int n) {

        String r = new String(" ");
        String a = new String("Hello world !");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            r += a;
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long stressBuilderTest(int n) {
        StringBuilder r = new StringBuilder("");
        StringBuilder a = new StringBuilder("Hello world !");

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            r = r.append(a);
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

}