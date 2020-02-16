package utile.sda;

public class InstanceOF {
    public static void main(String[] args) {
        inst();
    }

    public static void inst() {
        Object x;// = new Object();
        x = new String("casa");

        if (x instanceof String)
            System.out.println("Avem String");
        else if (x instanceof Integer)
            System.out.println("Avem Integer");
        else if (x instanceof Float)
            System.out.println("Avem Float");
        else if (x instanceof Double)
            System.out.println("Avem Double");
        else
            System.out.println("Nu e de nici un fel!");

    }

}


