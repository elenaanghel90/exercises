package org.sda.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator target1=new Calculator();
    Calculator target2;//o alta varianta fara variabila1 instantia si instantiem in clasa

    @Before
    public void setUp()  {
        target2=new Calculator();
    }

    @Test
    public void add() {
        target1.add(1,1);
        System.out.println("Count: " + target1.count);

        System.out.println("\n\n");

        target2.add(2,2);
        System.out.println("Count: " +target2.count);
    }
    @Test
    public void TestAdd2(){
        target1.add(1,1);
        System.out.println("Count: " + target1.count);

        System.out.println("\n\n");

        target2.add(2,2);
        System.out.println("Count: " +target2.count);
    }

    @Test
    public void subtract() {
    }

    @After
    public void tearDown() {
    }
}