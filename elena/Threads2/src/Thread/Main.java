package Thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final Integer QUEUE_SIZE = 20;
    public static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        Producator p1 = new Producator(q);
        Producator p2 = new Producator(q);
        Producator p3 = new Producator(q);

        Thread p1t = new Thread(p1);
        p1t.start(); //cu start pornesti ceva cu thread
        Thread p2t = new Thread(p2);
        p2t.start();
        Thread p3t = new Thread(p3);
        p3t.start();

        Consumator c1 = new Consumator(q);
        Consumator c2 = new Consumator(q);
        Thread c1t = new Thread(c1);
        Thread c2t = new Thread(c2);
        c1t.start();
        c2t.start();
    }
}
