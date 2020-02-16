package exercitii;


import java.util.Scanner;

public class Exe9TemaSapt2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number = ");
        int numar = input.nextInt();

        int stockNo;


       while (numar > 0) {
           stockNo = numar % 10;
           //nrInvers = nrInvers * 10 +stockNo; //in cazul asta daca numarul se termina in 0 nu va afisa 0
           System.out.print(stockNo);
           numar = numar /10;

       }


    }

}
