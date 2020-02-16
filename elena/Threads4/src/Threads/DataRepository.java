package Threads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataRepository implements Serializable {
    private List<Battle> battles = new ArrayList<>();


    public void addBattle(Battle b){
        battles.add(b);
    }

    public void reset(){
        battles.clear();
    }

    public List<Battle>getBattles(){
        List<Battle> ret = new ArrayList<>(battles);
        return ret;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       for(Battle b :battles){
           sb.append(b.toString());
           sb.append("\n");
       }
       return sb.toString();

    }
}
