public class ExeWhile {
    int x = 3;
    public static void main(String[] args) {
        int x = 3;
        while (x-- > 0) {
            System.out.println("x= " + x);
            //x--;
        }
        int y = 3;
        while (y > 0) {
            System.out.println("y= " + y);
            y--;
        }
        int z = 3;
        while (--z > 0) {
            System.out.println("z= " + z);
            //z--;
        }
    }
}
