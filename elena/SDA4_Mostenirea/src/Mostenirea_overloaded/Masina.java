package Mostenirea_overloaded;

public class Masina extends Vehicul{
    private Integer stare;


    public Masina(Integer vitezaMaxima) {
        super(vitezaMaxima);
       stare=100;
    }
    public void repara(){
        stare = 100; //cand functioneaza cum trebuie
    }

    public void defectiune(){
        stare -=10;  //starea se decrementeaza cu 10 cand se strica
    }
    public Integer raportStare(){
       return stare;
    }
}
