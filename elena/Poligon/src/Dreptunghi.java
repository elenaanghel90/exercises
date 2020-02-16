import java.util.LinkedList;

public class Dreptunghi extends Poligon{


    public Dreptunghi(LinkedList<Punct> puncte) {
        super(puncte);
    }

    @Override
    public Double calculeazaAria() {
        Double lungime = lungimeSegment(puncte.get(0), puncte.get(1));
        Double latime = lungimeSegment(puncte.get(1), puncte.get(2));
        return lungime * latime;
    }

}
