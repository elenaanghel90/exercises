import java.util.Scanner;

public class StringScrisInvers {

    public String StringMetoda(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        StringScrisInvers add = new StringScrisInvers();
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti cuvantul = ");
        String text = input.nextLine();
        System.out.println(" Cuvantul afisat in ordine inversa este = " + add.StringMetoda(text));

    }


}

