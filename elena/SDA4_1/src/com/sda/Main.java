package com.sda;

public class Main {
    public static void main(String[] args) {
        TestJava var = new TestJava();
        //var.testSetter();
        for (int i = 0; i <= 100; ++i) {
            var.setCeva(i);
            System.out.println(var.getCeva());
        }
    }
}
