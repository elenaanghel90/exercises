public class RecursivFibonacciSiAfisare {
    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(fibSequence(fib(7)));
    }
    public static int fib(int n){
        if(n==1||n == 2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static String fibSequence(int n){
        if(n==1){
            return "1 ";
        }
        else if(n==2){
            return "1, 1 ";
        }
        else{
            return fibSequence(n-1 )+ ", "+ fib(n);
        }
    }
}
