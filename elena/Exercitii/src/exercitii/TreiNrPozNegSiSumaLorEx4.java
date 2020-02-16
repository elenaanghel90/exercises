package exercitii;

import java.util.Scanner;

public class TreiNrPozNegSiSumaLorEx4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int contorPoz = 1;
        int contorNeg = 1;
        int sum=0;


        while((contorPoz <= 3)||(contorNeg <= 3)){
            System.out.print("Enter the number = ");
            int nr = in.nextInt();
            if (nr>0){
                contorPoz++;
            }
            else{
                contorNeg++;
            }
           sum +=nr;
        }

        System.out.println("The sum of numbers is = " + sum);
    }

}
