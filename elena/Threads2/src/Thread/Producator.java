package Thread;

import java.util.Queue;

public class Producator implements Runnable {
    public static Integer counter = 0;
    private Queue<String> q;

    public Producator(Queue<String> q) {
        this.q = q;
    }

    public synchronized static Integer nextCounterValue() { //cu synchronized nu pot intra mai multe threaduri in acelasi timp
//        Integer counter2 = counter;
//        counter = counter +1;
//        return counter2;
        //synchronized(contor); //alt mod de a scrie synchronized; e recomandat sa pui contor pentru ca e comun tuturor producatorilor si nu mai e nevoie sa pui static
        return counter++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            String obiect = new String("Obiect numarul " + nextCounterValue());
            System.out.println("Am creat: " + obiect);
            Main.lock.lock();
            q.offer(obiect); //offer adaugi ceva in coada
            Main.lock.unlock();
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

