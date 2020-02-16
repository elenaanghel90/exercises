public class Exe2Operatori {
    public static void main(String[] args) {
        int a = 7;
        boolean b = true;
        int c;

        a += 10;
        System.out.println("a%4=" + (a%4));
        System.out.println("a=" + a);
        if (++a > 17) {
            System.out.println("TRUE");
            System.out.println("a=" + a);
        }
        else
            {
            System.out.println("FALSE");
            System.out.println("a=" + a);
            }

        b = ( a++ > 18 )?  true : false;
        c= ( a++ > 18)? 10+6:20;

        System.out.println("b=" + b);
        System.out.println("a=" + a);
        System.out.println("a=" + a++);
        System.out.println("a=" + a);
        System.out.println("a=" + ++a);
        System.out.println("a=" + a);
    }
}
