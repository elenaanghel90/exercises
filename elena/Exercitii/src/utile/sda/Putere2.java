public class Putere2 {
    public static void main(String[] args) {

        System.out.println("64 e putere a lui 2? : " + putere2(64));
        System.out.println("65 e putere a lui 2? : " + putere2(65));
    }
    public static boolean putere2 (int numar){
        int x = numar & (numar - 1);
        System.out.println(numar + " = 0b" + Integer.toBinaryString(numar));
        if (x == 0){
            return true;
        }
        else{
            return false;
        }
    }
}