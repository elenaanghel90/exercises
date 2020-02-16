package noduri;

public class ListNoduri {
    private Nod primul;
    private Nod ultimul;

    public void add(String v){
        Nod nodNou = new Nod(v);

        if(ultimul != null)
            ultimul.setNodUrmator(nodNou);
        ultimul = nodNou;

        if(primul == null){
            primul = ultimul;
        }
    }

    public void removeAll(String v) {

        Nod deScos = getNod(v);

        while(deScos != null) {
            remove(deScos);
            deScos = getNod(v);
        }

    }


    public void remove(String v) {
        Nod deScos = getNod(v);

        if (deScos == null) {
            return;
        }

        remove(deScos);
    }

    public void remove(Nod deScos){
        if(deScos == primul){

            Nod tmp = primul;
            primul = primul.getNodUrmator();
            tmp.setNodUrmator(null);
        } else if(deScos == ultimul){

            Nod precedent = getPrecedent(ultimul);

            precedent.setNodUrmator(null);
            ultimul = precedent;
        } else {

            Nod precedent = getPrecedent(deScos);

            precedent.setNodUrmator(deScos.getNodUrmator());
            deScos.setNodUrmator(null);
        }
    }

    public Nod getPrecedent(Nod cautat){
        Nod n = primul;
        Nod precedent = null;

        while(n != null){
            if(n == cautat) {
                return precedent;
            }
            precedent = n;
            n = n.getNodUrmator();
        }

        return null;
    }

    public Nod getNod(String s){
        Nod n = primul;

        while(n != null){
            if(n.getValoare().equals(s)) {
                return n;
            }

            n = n.getNodUrmator();
        }

        return null;
    }

    public Nod getPrimul() {
        return primul;
    }

    public Nod getUltimul() {
        return ultimul;
    }
}