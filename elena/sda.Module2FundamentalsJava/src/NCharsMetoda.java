import java.util.Scanner;

public class NCharsMetoda {

    public static String getStringStatic(int n, char c) {
        return "static String";
    }

    public String getString(int n, char c) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NCharsMetoda app = new NCharsMetoda();

        System.out.print("Introduceti n = ");
        int n = input.nextInt();
        System.out.print("Introduceti caracterul = ");
        char c = input.next().charAt(0);

        for (int i = 1; i <= n; i++) {
            System.out.println(app.getString(i, c));
        }
        for (int i = (n-1); i > 0; i--) {

            System.out.println(app.getString(i, c));

            // System.out.println(getString(input.nextInt();(char)input.nextInt()));
        }
    }
}
