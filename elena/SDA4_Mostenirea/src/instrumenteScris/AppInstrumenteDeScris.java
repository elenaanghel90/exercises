package instrumenteScris;

import java.util.LinkedList;

public class AppInstrumenteDeScris {
    public static void main(String[] args) {
        LinkedList<MainInstrumenteScris> listaInstrumenteScris = new LinkedList<>();

        Stilou Stilou1 = new Stilou(100, 25.0d, "maro", "otel");
        listaInstrumenteScris.add(Stilou1);
        Carioca Carioca1 = new Carioca(90, 29.0d, "red", true);
        listaInstrumenteScris.add(Carioca1);
        Carioca Carioca2 = new Carioca(90, 29.0d, "red", false);
        listaInstrumenteScris.add(Carioca2);
        Carioca Carioca3 = new Carioca(90, 29.0d, "red", true);
        listaInstrumenteScris.add(Carioca3);
        Creion Creion1 = new Creion(80, 12.4d, "gri", "HB");
        listaInstrumenteScris.add(Creion1);
        Creion Creion2 = new Creion(80, 12.4d, "gri", "HB");
        listaInstrumenteScris.add(Creion2);
        int contorStilou = 0;
        int contorCarioca = 0;
        int contorRefillable = 0;
        int contorCreion = 0;
        for (int i = 0; i < listaInstrumenteScris.size(); ++i) {
            MainInstrumenteScris aux = listaInstrumenteScris.get(i);

            if (aux instanceof Stilou) {
                contorStilou++;
            } else if (aux instanceof Carioca) {
                contorCarioca++;
            } else if (aux instanceof Creion) {
                contorCreion++;
            }
        }
        System.out.println("In lista sunt " + contorStilou + " stilouri " + contorCreion + " creioane " + contorCarioca + " carioci.");

        for (int i = 0; i<listaInstrumenteScris.size(); ++i){
            MainInstrumenteScris aux = listaInstrumenteScris.get(i);
            if(aux instanceof Carioca){
                Carioca aux2 = ((Carioca)aux);
                if(aux2.isRefillable()){
                    contorRefillable++;
                }
            }
        }
        System.out.println("In lista avem " + contorRefillable + " carioci care pot fi refillable");
        System.out.println(listaInstrumenteScris);
    }

}
