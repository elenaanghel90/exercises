import java.util.LinkedList;

public class Patrat extends Poligon {

    public Patrat(LinkedList<Punct> puncte) {
        super(puncte);
    }

    @Override
    public Double calculeazaAria() {
       Double l = lungimeSegment(puncte.get(0), puncte.get(1));
       return l*l;
    }

}
