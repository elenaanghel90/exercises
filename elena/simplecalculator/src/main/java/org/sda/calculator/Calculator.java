package org.sda.calculator;

public class Calculator {

    int count = 0;

    public int add(int x, int y) {
        System.out.println("Inside 'add' method");
        count++;
        return x + y;
    }

    public int subtract(int x, int y) {
        System.out.println("Inside 'sutract' method");
        return x - y;
    }
}
