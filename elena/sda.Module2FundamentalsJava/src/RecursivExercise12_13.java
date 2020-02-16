public class RecursivExercise12_13 {
    public static void main(String[] args) {
        System.out.println(indexOf("Barack Obama", "a"));

    }

    public static int indexOf(String x, String y) {
        if(x.length() < y.length()){
            return  -1;
        }
        if (x.substring(0, y.length()).equals(y)) {
            return 0;
        }

        if(x.length()==y.length()){
            return -1;
        }
        else {
            int contor = indexOf(x.substring(1), y);
            if (contor < 0){
                return -1;
            }
            else{
                return 1 + contor;
            }
        }
    }
}
