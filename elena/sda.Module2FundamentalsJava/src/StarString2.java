import java.sql.SQLOutput;

public class StarString2 {
    public static void main(String[] args) {
        System.out.println(starString(power(2,4)));
    }

    public static String starString(int i) {
        if (i == 1) {
            return "*";
        } else {
            return "*" + starString(i - 1);
        }
    }

    public static int power(int baza, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return baza * power(baza, exponent - 1);
        }
    }
}

