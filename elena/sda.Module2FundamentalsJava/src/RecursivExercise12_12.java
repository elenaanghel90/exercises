public class RecursivExercise12_12 {
    public static void main(String[] args) {
        System.out.println(isReverse("e via n", "N aIv E"));

    }

    public static boolean isReverse(String x, String y) {
        if (x.length() != y.length()) {
            return false;
        }
        if((x == "")&&(y == "")){
            return true;
        }

        if (x.toLowerCase().charAt(0) == y.toLowerCase().charAt(y.length() - 1)) {
            if(x.length()==1){
                return true;
            }
            return isReverse(x.substring(1), y.substring(0, y.length() - 1));
        }
        else{
            return false;
        }
    }
}
