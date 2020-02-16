public class RecursivExercise12_9 {
    public static void main(String[] args) {
        System.out.println(sumTo(4));

    }
    public static double sumTo(int n) {
        if(n < 0){
            throw new IllegalArgumentException();
        }
        else if (n == 0){
            return 0.0;
        }
        else if(n==1){
            return 1.0;
        }
        else {
            return(sumTo(n-1)+ (1/n));
        }

    }
}
