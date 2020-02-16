package utile.sda;

public class Recursiv {
    public static void main(String[] args) {
        int n = 5;
        System.out.print("print before:");
        printBefore(n);
        System.out.print("\nprint after:");
        printAfter(n);
        System.out.print("\nprint before & after:");
        printBeforeAndAfter(n);
    }

    static void printBefore(int n){
        if (n>0){
            System.out.print(n + "; ");
            printBefore(n-1);
        }
    }
    static void printAfter(int n){
        if (n>0){
            printAfter(n-1);
            System.out.print(n + "; ");
        }
    }
    static void printBeforeAndAfter(int n){
        if (n>0){
            System.out.print(n + "; ");
            printBeforeAndAfter(n-1);
            System.out.print(n + "; ");
        }
    }
}