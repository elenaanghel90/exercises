import java.util.Scanner;

public class NNumerePare {
    public String nrPare(int n) {
        String result = "";
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
               result+= j + " ";

            }
        }
        return result;
    }
    public String nrPare2(int n) {
        String result = "";
        int j = 2;
        while ( j <= n){
            result += j + " ";
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NNumerePare app = new NNumerePare();
        System.out.print("Introduceti n : ");
        int n = in.nextInt();
        System.out.println("Cele " + n + " numere pare sunt " + app.nrPare(n) + " ");
    }
}


