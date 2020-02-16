package exercitii;

public class TemaVector {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};

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
        for (int i = 0; i < arrayOfInts.length; i++) {
            sum += arrayOfInts[i];

            arithmeticMean = ((float) sum / arrayLength);
        }
        System.out.println(("The sum is: " + sum));
        System.out.println("The arithmetic mean is: " + arithmeticMean);

    }
}

