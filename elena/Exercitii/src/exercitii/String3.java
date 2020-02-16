package exercitii;

public class String3 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        if (a == b) {
            System.out.println("Adevarat!");
        } else {
            System.out.println("False!");
        }
        if (a == c) {
            System.out.println("Adevarat!");
        } else {
            System.out.println("False!");
        }

        if (a.compareTo(c) > 0){
            System.out.println("a > c");
        }
        else
        {
            if (a.compareTo(c) == 0){
                System.out.println("a == c");
            }
            else{
                System.out.println("a < c ");
            }
        }
    }
}


