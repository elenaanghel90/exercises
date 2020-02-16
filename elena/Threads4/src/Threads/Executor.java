package Threads;

import java.util.Queue;

public class Executor extends Thread {
    private Queue<Action> q;

    public Executor (Queue<Action> q){
        this.q = q;
    }

    @Override
    public void run(){
        while(true){
            Action a = q.poll();
            if(a==null){
                try {
                    synchronized (q) {
                        q.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }
            switch(a.getType()){
                case FILTER_BY_YEAR:
                    for(Battle x: CommandReader.dataRepo.getBattles()){
                        if(x.getYear().equals(a.getYear())){
                            System.out.println(x);
                        }
                    }
                    break;

                case WON_BY_ATTACKER:
                    break;
            }
        }
    }

}
