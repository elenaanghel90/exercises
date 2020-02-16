package calculator;

import static org.junit.Assert.fail;

public class Calculator {

    public boolean isActive = true;
    public String[] methods = {"add", "subtract"};


    public int add(int x, int y) {
        System.out.println("Inside 'add' method");
        return x + y;
    }

    public int subtract(int x, int y) {
        System.out.println("Inside 'sutract' method");
        return x - y;
    }

    public int multiply(int x, int y) {
        System.out.println("Inside 'multiply' method");
        return x * y;
    }

    public int divide(int x, int y) {
        System.out.println("Inside 'divide' method");
        return x / y;
    }

    public int divisionByZero(int x, int y) {
        int result = 0;
        try {
            //incercam o impartire la zero
            result = x / y;
            //eroarea e aruncata
        } catch (ArithmeticException e) {
            //in situatia in care princem aceasta eroare, nu dorim sa continuam executia
            fail("Impartirea la zero nu este permisa");
        }
        return result;
    }


}
