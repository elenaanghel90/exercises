public class Array {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};
        System.out.println(arrayOfInts[0]); // print 10
        System.out.println(arrayOfInts[2]); // print 20
        System.out.println(arrayOfInts[4]); // print 30
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.print(arrayOfInts[i] + " ");
            arrayOfInts[i] += 100;
        }
        System.out.println("Alta afisare:"); // print 10 15 20 25 30
        for (int i : arrayOfInts) {
            System.out.print(i + " ");
        } // print 10 15 20 25 30

    }
}
