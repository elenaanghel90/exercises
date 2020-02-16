import java.util.Scanner;

public class Exe5Tema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of dollars : ");
        int noDollars = input.nextInt();
        int i = 1;

        while (i <= noDollars) {
            i++;

            System.out.print("$");

        }
    }
}

