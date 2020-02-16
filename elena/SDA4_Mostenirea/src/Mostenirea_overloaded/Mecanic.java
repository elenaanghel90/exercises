package Mostenirea_overloaded;

public class Mecanic  {
    public void repara(Vehicul veh){
        if(veh instanceof Masina){ //facem cast pentru ca am folosit vehicul cand am instantiat obicetul in main
            repara((Masina)veh);
        }
        if(veh instanceof Bicicleta){
            repara((Bicicleta)veh);
        }
    }
    public void repara(Masina masina){
        System.out.println("Repar o masina");
        masina.repara();
    }
    public void repara(Bicicleta bicicleta){
        System.out.println("Repar o bicicleta");
        bicicleta.repara();
    }
}
