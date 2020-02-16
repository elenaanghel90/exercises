public class RecursiveExercise12_6 {
    public static void main(String[] args) {
        System.out.println(writeChars(5));

    }
    public static String writeChars(int n) {
        if(n < 1){
            throw new IllegalArgumentException();
        }
        else if (n == 1){
            return "1";
//            System.out.print("1");
        }
        else if(n%2 == 0){
            return (writeChars(n-1)+ " " + (n*n));
//            System.out.print(" ");
//            System.out.print(n*n);
        }
        else {
            return((n*n)+ " " + writeChars(n-1));
//            System.out.print(n * n);
//            System.out.print(" ");
//            writeChars(n - 2);
        }
    }
    }
