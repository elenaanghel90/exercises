import java.util.LinkedList;

public class Trapez extends Poligon {

    public Trapez(LinkedList<Punct> puncte) {
        super(puncte);
    }

    @Override
    public Double calculeazaAria() {
        Double segment1 = lungimeSegment(puncte.get(0), puncte.get(1));
        Double segment2 = lungimeSegment(puncte.get(1), puncte.get(2));
        Double segment3 = lungimeSegment(puncte.get(2), puncte.get(3));
        Double segment4 = lungimeSegment(puncte.get(3), puncte.get(0));
        Double bazaMica;
        Double bazaMare;
        Double laturaNeparalela;

        if (drepteParalele(puncte.get(0), puncte.get(1), puncte.get(2), puncte.get(3))) {
            if (segment1 > segment3) {
                bazaMare = segment1;
                bazaMica = segment3;
//                Double unghiBazaMare = Math.atan2()
            } else {
                bazaMare = segment3;
                bazaMica = segment1;
            }
            laturaNeparalela = segment2;

        }
        if (drepteParalele(puncte.get(1), puncte.get(2), puncte.get(3), puncte.get(0))) {
            if (segment2 > segment4) {
                bazaMare = segment2;
                bazaMica = segment4;
            } else {
                bazaMare = segment4;
                bazaMica = segment2;
            }
            laturaNeparalela = segment1;
        }
        return 0d;
    }


    public Boolean drepteParalele(Punct d1a, Punct d1b, Punct d2a, Punct d2b) {
        Double pantad1 = (d1b.getY() - d1a.getY()) / (d1b.getX() - d1a.getX());
        Double pantad2 = (d2b.getY() - d2a.getY()) / (d2b.getX() - d2a.getX());
        return pantad1.equals(pantad2);
    }

    public Double calculeazaInaltimea() {
return null;
    }
}
