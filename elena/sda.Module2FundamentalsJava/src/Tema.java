public class Tema {

    public static final int NR_LINIE = 7;
    public static void main(String[] args) {
        for (int linie = 1; linie <= NR_LINIE; linie++) {

            int steluta = 2 * (linie - 2) + 2;
            for (int i = 0; i < steluta; i++) {
                System.out.print("*");
            }
            int dolar = NR_LINIE - linie +1;
            for (int j = 0; j < dolar; j++) {
                System.out.print("$");
            }
            int steluta2 = 2 * (NR_LINIE - linie +1);
            for (int k = 0; k < steluta2; k++) {
                System.out.print("*");
            }
            int dolar2 = NR_LINIE - linie +1;
            for (int j = 0; j < dolar2; j++) {
                System.out.print("$");
            }
            int steluta3 = 2 * linie - 2;
            for (int i = 0; i < steluta3; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}











