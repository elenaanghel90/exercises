public class RecursivInmultire {

    public static void main(String[] args) {
        System.out.println(produs(5));
    }
    public static int produs(int n){
        if(n==1){
            return 1;
        }
        else{
            return produs(n-1)*n;
        }
        }
    }
