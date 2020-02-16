import java.util.LinkedList;

public abstract class Poligon {
    protected LinkedList<Punct> puncte;

    public Poligon(LinkedList<Punct> puncte) {
        this.puncte = puncte;
    }

    public abstract Double calculeazaAria();

    public void translateaza(Double dx, Double dy) {
        for (Punct p : puncte) {
            p.translatie(dx, dy);
        }
    }

    public void scaleaza(Double a) {
        for (Punct p : puncte) {
            p.scalare(a);
        }
    }


    public Double calculeazaPerimetru() {
        Double sum = 0d;
        for (int i = 0; i < puncte.size(); i++) {
            Punct punct1 = puncte.get(i);
            Punct punct2 = puncte.get(i + 1 == puncte.size() ? 0 : i + 1); //Punct punct2 = puncte.get(i + 1);
            Double d = Math.sqrt(Math.pow((punct2.getX() - punct1.getX()), 2) + Math.pow((punct2.getY() - punct1.getY()), 2));

            sum = sum + d;
        }
        return sum;
    }

    public Double lungimeSegment(Punct punct1, Punct punct2){
        Double distanta = Math.sqrt(Math.pow(punct2.getX()-punct1.getX(),2)+ Math.pow(punct2.getY() - punct1.getY(),2));
        return distanta;
    }
}
