package Threads;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;

public class CommandReader {

    public static DataRepository dataRepo = new DataRepository();

    public static void main(String[] args) throws InterruptedException{
        Thread th = new Loader();
        th.start();
        //astept sa termine loaderul treaba
        th.join();

        Queue<Action> queue = new ConcurrentLinkedDeque<>();
        for(int i=0; i<3; ++i){
            Thread te = new Executor(queue);
            te.start();
        }

        Scanner input = new Scanner(System.in);
        Boolean isRunning=true;
        while (isRunning){
            System.out.println("Enter a command ");
            String command = input.next();

            switch(command){
                case "year":
                    Integer y = input.nextInt();
                    Action a = new Action(Action.TYPE.FILTER_BY_YEAR);
                    queue.add(a);
                    synchronized (queue){
                        queue.notify();
                    }
                    break;
                case "exit":
                    isRunning =false;
                    break;
            }
        }
        input.close();
    }
}
