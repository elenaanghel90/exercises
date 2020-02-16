import java.util.Arrays;
import java.util.Scanner;

public class SirIntrodusDeLaTasatatura {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti lungime sir:");
        int lungime = in.nextInt();
        int[] sir = new int[lungime];

        for (int i = 0; i < lungime; i++) {
            System.out.print("introduceti sir[" + i + "] = ");
            sir[i] = in.nextInt();
        }
        System.out.println("Sirul introdus este: " + Arrays.toString(sir));
    }
}
