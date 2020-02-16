import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        short x;
        int y = 0xabcdef;
        double d = input.nextDouble();

        x = (short)y;
        System.out.println("y = " + y + "\nx =" + x);
        System.out.println("y = " + Integer.toHexString(y) + "\nx = " + Integer.toHexString(x));
        y = (int)d;
        System.out.println("y este acum: " + y);
    }
}
