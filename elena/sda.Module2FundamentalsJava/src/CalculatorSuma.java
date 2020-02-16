import java.util.Scanner;
public class CalculatorSuma {

    Scanner input = new Scanner(System.in);
    int x, y;

    public void introduceNr() {
        System.out.print("Introduceti primul numar = ");
        x = input.nextInt();
        System.out.print("Introduceti al doilea numar = ");
        y = input.nextInt();
    }
    public int calculeazaSuma() {
        return x + y;
    }

    public static void main(String[] args) {
        CalculatorSuma obiect = new CalculatorSuma();
        obiect.introduceNr();
        System.out.println("Suma celor doue numere este = " + obiect.calculeazaSuma());
    }

}