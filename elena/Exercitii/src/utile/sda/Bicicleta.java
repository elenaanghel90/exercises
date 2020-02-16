package utile.sda;

public class Bicicleta {
    private String producator;
    private int greutate;
    String culoare;
    static int numarTotal;

    public Bicicleta(String pr, int gr, String cul) {
        this.producator = pr;
        this.greutate = gr;
        this.culoare = cul;
        numarTotal++;
    }
public String myString(){
        return(this.producator +" "+ this.culoare);

}
    public static int getCount() {
        return numarTotal;
    }

    public String getProducator() {//pentru ca e privat si nu avem acces in el, get e pt ca sa il citim. String ne intoarce numele /set de caractere (get preia rezultatul)
        return this.producator;

    }
    public void setProducator(String prod) { //pentru ca e privat si nu avem acces in el, set e pt ca sa il modificam. Void nu intoarce nimic (set nu intoarce nimic, doar face ceva)
        this.producator = prod; //this e field al clasei
        System.out.println("Am setat producatorul: " + producator);

    }
}
