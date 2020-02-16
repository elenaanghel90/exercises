package Hoteluri;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ManagerRezervari {

    private static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private Set<Rezervare> listaRezervari = new HashSet<>();
    private List<Hotel> listaHoteluri = new ArrayList<>();

    public ManagerRezervari() {
        listaHoteluri.add(new Hotel("Minerva"));
        listaHoteluri.add(new Hotel("Orhideea"));
        listaHoteluri.add(new Hotel("Shaker"));
    }

    public void adaugaRezervare() {
        Scanner input = new Scanner(System.in);

        System.out.print("Data inceput sejur (dd.mm.yyyy): ");
        LocalDate dataInceputSejur = LocalDate.parse(input.nextLine(), dateFormat);
        System.out.print("Data final sejur (dd.mm.yyyy): ");
        LocalDate dataFinalSejur = LocalDate.parse(input.nextLine(), dateFormat);
        System.out.print("Tip de camera (DOUBLE/SINGLE) : ");
        Rezervare.TipCamera tipCamera = Rezervare.TipCamera.valueOf(input.nextLine().toUpperCase()); //daca nu pui upperCase si scrii cu litere mici va da eroare
        System.out.print("Numele titularului: ");
        String numeTitular = input.nextLine();
        System.out.print("Hotel dorit: ");
        String numeHotel = input.nextLine();
        System.out.print("Numarul de camera alocat este: ");
        int nrCameraAlocat = input.nextInt();
        System.out.print("Mic dejun inclus (True/ False): ");
        Boolean micDejunInclus = input.nextBoolean();

        Rezervare rezervare = new Rezervare();
        rezervare.setDataInceputSejur(dataInceputSejur);
        rezervare.setDataFinalSejur(dataFinalSejur);
        rezervare.setTipCamera(tipCamera);
        rezervare.setNrCamera(nrCameraAlocat);
        rezervare.setTitularRezervare(new Persoana(numeTitular));
        rezervare.setMicDejunInclus(micDejunInclus);

        for (Hotel h : listaHoteluri) {
            if (numeHotel.equals(h.getNume())) {
                rezervare.setHotel(h);
            }
        }

        System.out.println(rezervare);
        listaRezervari.add(rezervare);

    }

    public void afiseazaRezervarePentruPersoana() {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numele persoanei: ");
        String nume = input.nextLine();
        for (Rezervare rez : listaRezervari) {
            if (nume.equals(rez.getTitularRezervare().getNume())) {
                System.out.println(rez);
            }
        }
    }

    public void afiseazaMeniu() {
        System.out.println();
        System.out.println("1. Adauga rezervare: ");
        System.out.println("2. Anulare rezervare: ");
        System.out.println("3. Afiseaza rezervari pentru persoana: ");
        System.out.println("4. Iesire din program");
        System.out.println("Introduceti optiunea dorita: ");
    }

    public void anuleazaRezervare() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Introduceti numarul rezervarii: ");
        int numarRezervare = input.nextInt();

        for(Rezervare rez: listaRezervari){
            if(numarRezervare == rez.getNumarRezervare()){
                rez.setAnulata(true);
                System.out.println("Rezervare cu numarul: " + rez + " a fost anulata");
            }
        }


    }
}
