import java.util.Scanner;

public class Exe9TemaVar2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number a = ");
        int a = input.nextInt();
        System.out.print("Enter the number b = ");
        int b = input.nextInt();
        System.out.print("Enter the number c = ");
        int c = input.nextInt();
        int stockNoMin;
        int stockNoMax;
        int stockMiddleNo;

        if ((a < b) && (a < c)) {
            stockNoMin = a;
        } else {
            if (b < c) {
                stockNoMin = b;
            } else {
                stockNoMin = c;
            }
        }


        if ((a >= b) && (a >= c)) {
            stockNoMax = a;
        } else {
            if (b > c) {
                stockNoMax = b;
            } else {
                stockNoMax = c;
            }
        }

        if ((stockNoMin < a) && (stockNoMax > a)) {
            stockMiddleNo = a;
        } else {
            if ((stockNoMin < b) && (stockNoMax > b)) {
                stockMiddleNo = b;
            } else {
                stockMiddleNo = c;
            }
        }
        System.out.print(stockNoMin + " ");
        System.out.print(stockMiddleNo + " ");
        System.out.print(stockNoMax);
    }

}


