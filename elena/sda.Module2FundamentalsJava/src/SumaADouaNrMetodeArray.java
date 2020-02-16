import java.util.Scanner;

public class SumaADouaNrMetodeArray {

    Scanner input = new Scanner(System.in);
    int[] numere;

    public void citeste(int n) {

        this.numere = new int[n];

        for (int i = 0; i < numere.length; i++) {
            System.out.print("Introduceti numarul al " + i + " - lea : ");
            numere[i] = input.nextInt();
        }
    }

    public int sum(int n) {
        int suma = 0;
        for (int j = 0; j < n; j++) {
            suma += numere[j];
        }
        return suma;
    }

    public static void main(String[] args) {
        SumaADouaNrMetodeArray app = new SumaADouaNrMetodeArray();
        System.out.println("Introduceti cate numere vreti sa adunati: ");
        int n = app.input.nextInt();
        app.citeste(n);
        System.out.println("Suma celor numerelor este " + app.sum(n));
    }
}



