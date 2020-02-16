import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};
        Scanner in = new Scanner (System.in);
        System.out.print("Introduceti n = ");
        int nr = in.nextInt();
        int contor = 0;

        for (int i = 0; i<arrayOfInts.length; i++) { //i++ = i+=1
            if (arrayOfInts[i] == nr) {
                contor++;

            }
        }
               System.out.println("Numarul : " + nr + " se regaseste in sir de " + contor + " ori! ");

    }
}
