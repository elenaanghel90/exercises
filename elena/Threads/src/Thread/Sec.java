package Thread;

import static java.lang.Thread.*;

public class Sec extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 15; ++i){
            System.out.println("Secunda " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        }
    }

