package banca;

import java.util.Random;

public class Client extends Persoana {
    private Cont cont;

    public Client(String cnp, String nume) {
        super(cnp, nume);
        Random rand = new Random();
        Integer ibanSuffix = rand.nextInt(9000);
        ibanSuffix += 1000;
        this.cont = new Cont(cnp + ibanSuffix);
    }

    public Cont getCont() {
        return cont;
    }

    public Double alimentareCont(Double suma) {
        if (suma > 0) {
            cont.modificareBalanta(suma);
        }
      return this.cont.interogareBalanta();
    }

    public Double retrageBani(Double suma) {
        //cont.modificareBalanta(cont.interogareBalanta() - suma);
        if (suma > 0) {
            cont.modificareBalanta(-suma);
        }
        return this.cont.interogareBalanta();
    }


//    public void retrage100() {
//        cont.modificareBalanta(cont.interogareBalanta() - 100);
//    }

    public void setCont(Cont cont) {
        this.cont = cont;
    }
    @Override
    public String toString(){
        return "{Client nume: " +this.nume + " CNP : " + this.cnp + "}";
    }
}
