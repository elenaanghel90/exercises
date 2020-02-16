public class RecursiveExercise12_11 {
    public static void main(String[] args) {
        System.out.println(repeat("hello", 3));

    }

    public static String repeat(String s, int n) {
        if(n<0){
           throw new IllegalArgumentException();
        }
        else if(n==0){
            return "";
        }
        else {
            return s + repeat(s, n-1);
        }
    }
}
