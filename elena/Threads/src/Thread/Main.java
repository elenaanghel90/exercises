package Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread x = new Sec();
        x.start();//creaza un nou thread si va rula run in interiorul lui
        for(int i =0; i<30;++i){
            System.out.println("Main Secunda " + i);
            Thread.sleep(500);
        }
    }
}
