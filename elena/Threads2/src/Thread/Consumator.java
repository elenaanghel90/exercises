package Thread;

import java.util.Queue;

public class Consumator implements Runnable {
    private Queue<String> q;

    public Consumator(Queue<String> q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (true) {
            String obj;
            Main.lock.lock();

            if (q.isEmpty()) {
                try {
                    Main.lock.unlock();//dam producatorului ocazia sa produca obiect
                    Thread.sleep(10);
                    // Main.lock.lock(); nu era bine aici, ca in cazul in care ar fi dat exceptie nu se mai bloca, adica nu mai intra pe lock ca sa nu mai produca
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }
            obj = q.poll(); //scoate din coada urmatorul element; daca coada e goala intoarce null
            Main.lock.unlock();

            System.out.println("Am consumat: " + obj);

        }
    }
}

