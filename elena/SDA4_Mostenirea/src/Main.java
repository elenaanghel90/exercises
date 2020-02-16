import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Sportiv> listaSportivi = new LinkedList<>();

        Fotbalist fotbalist1 = new Fotbalist(190, 84, "George", 45.5f, "Atacant", 300);
        listaSportivi.add(fotbalist1);
        Voleibalist voleibalist1 = new Voleibalist(200, 70, "Ion", "Pivot", 2f, 5, 1.3f, "V.C. Vaslui");
        listaSportivi.add(voleibalist1);

        for(int i=0;i<listaSportivi.size();++i){
            Sportiv aux = listaSportivi.get(i);
            if(aux instanceof Fotbalist){ //
                System.out.println("Elementul " + i + " este fotbalist");
            }
            else if(aux instanceof Voleibalist){
                System.out.println("Elementul " + i + " este voleibalist");
            }
        }
    }
}
