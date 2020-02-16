public class RecursivExercise12_3 {
    public static void main (String[] args){

        System.out.println(writeSequence(10));
    }
    public static String writeSequence(int i){
        if (i < 1){
            throw new IllegalArgumentException();
        }
        else if(i == 1){
          return "1";
        }
        else if(i == 2) {
            return ((i+1)/2) + " "  + ((i+1)/2);
        }
        else {
            return ((i+1)/2) + " " + writeSequence(i-2)+ " " + ((i+1)/2);
        }
    }
}
