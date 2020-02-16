public class RecursivExercise12_7 {
    public static void main(String[] args) {
        System.out.println(writeChars(6));

    }
    public static String writeChars(int n) {
        if(n < 1){
            throw new IllegalArgumentException();
        }
        else if (n == 1){
            return "*";
        }
        else if(n == 2){
            return ("**");
        }
        else if(n%2!=0){
           return("<" + writeChars(n-2)+ ">");
        }
        else {
            return("<"+ writeChars(n-2)+ ">");
        }
    }
}
