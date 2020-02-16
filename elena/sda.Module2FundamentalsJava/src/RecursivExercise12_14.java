public class RecursivExercise12_14 {
    public static void main(String[] args) {
        System.out.println(evenDigits(8342116));

    }

    public static int evenDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int aux = n % 10;
            if (aux % 2 == 0) {
                return 10 * evenDigits(n / 10) + aux;
            } else {
                return evenDigits(n / 10);
            }
        }
    }
}
