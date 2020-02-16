public class SumaNrPareDinSir {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30, 15, 15, 20};

        System.out.println("The numbers are: ");
        for (int i : arrayOfInts) {
            System.out.print(i + " ");
        }
        System.out.println();
        int arrayLength = arrayOfInts.length;
        System.out.println("The length of the array is: " + arrayLength);


        System.out.println();
        int sum = 0;
        float arithmeticMean = 0;
        int sumImpare = 0;
        for (int i : arrayOfInts) {
            if (i % 2 ==0) {
                sum += i;

                arithmeticMean = ((float) sum / arrayLength);
            }
            else {
                sumImpare += i;
            }
        }
        System.out.println(("Suma Numerelor pare: " + sum));
        System.out.println(("Suma Numerelor impare: " + sumImpare));
        System.out.println("The arithmetic mean is: " + arithmeticMean);
    }
}
