public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("i=" + i + " ; ");
        }
        System.out.println();
        for (int i = 0; i < 20; i = i + 2) {
            System.out.print("i=" + i + " ; ");
        }
        System.out.println();
        for (int i = 0; i < 30; i = i + 5) {
            System.out.print("i=" + i + " ; ");
        }
        System.out.println();
        for (int i = 1, j=1; (i <= 10) && (j<50); i++, j+=10) {
            //System.out.println( i + "^2" + "=" + i * i);
            System.out.println( "i = " + i + " j = " + j );
        }
    }
}