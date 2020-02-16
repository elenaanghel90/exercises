package Hoteluri;

import java.util.*;

public class Main {

//    public static void creeazaRezervari() {
//        Rezervare r1 = new Rezervare();
//        r1.setDataInceputSejur(LocalDate.parse("12.12.2018", dateFormat));
//        r1.setDataFinalSejur(LocalDate.parse("12.12.2018", dateFormat));
//        r1.setMicDejunInclus(true);
//        r1.setNrCamera(1);
//        r1.setTipCamera(Rezervare.TipCamera.DOUBLE);
//        r1.setTitularRezervare(new Persoana("Elena"));
//        Rezervare r2 = new Rezervare();
//        r2.setDataInceputSejur(LocalDate.parse("13.12.2019", dateFormat));
//        r2.setDataFinalSejur(LocalDate.parse("20.12.2019", dateFormat));
//        r2.setMicDejunInclus(false);
//        r2.setNrCamera(5);
//        r2.setTipCamera(Rezervare.TipCamera.SINGLE);
//        r2.setTitularRezervare(new Persoana("Emanuel"));
//
//        listaRezervari.add(r1);
//        listaRezervari.add(r2);
//    }

    public static void main(String[] args) {
//        creeazaRezervari();
        ManagerRezervari manager = new ManagerRezervari();
        Scanner input = new Scanner(System.in);

        while (true) {
            manager.afiseazaMeniu();
            int optiune = input.nextInt();

            switch (optiune) {
                case 1:
                   manager.adaugaRezervare();
                    break;
                case 2:
                    manager.anuleazaRezervare();
                    break;
                case 3:
                    manager.afiseazaRezervarePentruPersoana();
                    break;
                case 4:
                    input.close();
                    return;
                default:
                    System.err.println("Optiunea introdusa nu este implementata! Introduceti alta optiune: ");
            }
        }
    }
}
