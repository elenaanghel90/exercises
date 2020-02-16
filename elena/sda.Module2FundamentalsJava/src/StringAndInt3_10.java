public class StringAndInt3_10 {
    public static void main(String[] args) {
        printStrings("abc", 5);
        printStrings(1, 6);

    }

    public static void printStrings(String x, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(x);
    }

    public static void printStrings(int x, int n) {
        for (int i = 0; i < n; i++)
            System.out.print(x);
    }

}


