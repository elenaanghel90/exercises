public class StarStringEx12_1 {
    public static void main(String[] args) {
        System.out.println(starString(4));
    }

    public static String starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return "*";
        } else {
            return starString(n - 1) + starString(n - 1);
        }
    }
}
