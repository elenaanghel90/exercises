public class RecursiveExercise12_10 {
    public static void main(String[] args) {
        System.out.println(digitMatch(123456, 654321));

    }

    public static int digitMatch(int x, int y) {
        if ((x < 0) || (y < 0)) {
            throw new IllegalArgumentException();
        } else if (((x == 0) && (y == 0))
                || (x == 0 && y % 10 == 0)
                || (y == 0 && x % 10 == 0)) {
            return 1;
        } else if (((x % 10 != 0) && (y == 0))
                || ((y % 10 != 0) && (x == 0))) {
            return 0;

        } else if (x % 10 == y % 10) {
            if (x / 10 == 0 && y / 10 == 0) {
                return 1;
            } else {
                return 1 + digitMatch(x / 10, y / 10);
            }
        } else {
            if ((x / 10 == 0 && y / 10 == 0)
            || (x / 10 != 0 && y / 10 == 0)
            || (y / 10 != 0 && x / 10 == 0)){
                return 0;
            } else {
                return digitMatch(x / 10, y / 10);
            }
        }
    }
}
