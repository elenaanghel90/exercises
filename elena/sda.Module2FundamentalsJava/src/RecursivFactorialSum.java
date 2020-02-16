public class RecursivFactorialSum {
    public static void main(String[] args) {
        System.out.println(sum(4));
        System.out.println(produs(4));
        System.out.print(afisareSum(4)+ " = " + sum(4));
        System.out.println();
        System.out.print(afisareProdus(4) + " = " + produs(4));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sum(n - 1) + n;
        }
    }
    public static int produs(int n) {
        if (n == 1) {
            return 1;
        } else {
            return produs(n - 1) * n;
        }
    }
    public static String afisareSum(int n) {
        if (n == 1) {
            return "1";
        } else {
            return afisareSum(n - 1) + " + " + n;
        }
    }
    public static String afisareProdus(int n) {
        if (n == 1) {
            return "1";
        } else {
            return afisareProdus(n - 1) + " * " + n;
        }
    }
}


