package exercitii;

public class ForBreak {
    public static void main(String[] args) {


        for (int i = 1, j=1 ; (i <= 10) && (j<50); i++, j+=10) {
            // System.out.println(i + "^2 = " + i * i);
            if ((i % 2) == 0){
                //break;
                continue;
            }
            System.out.println("i = " + i + " j = " + j);
        }
    }
}