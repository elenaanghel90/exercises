public class RecursivExercise12_8 {
    public static void main(String[] args) {
        System.out.println(multiplyEvents(3));

    }
    public static int multiplyEvents(int n) {
        if(n < 0){
            throw new IllegalArgumentException();
        }
        else if (n == 1){
            return 2;
        }
        else {
            return(multiplyEvents(n-1)*2*n);
        }

    }
}
