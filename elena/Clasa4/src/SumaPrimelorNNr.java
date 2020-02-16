public class SumaPrimelorNNr {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        int i = 1; //nu are rost sa il adunam pe 0

        /*for (int i = 0; i < n; i++) {*/

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is:" + sum);
    }

}

