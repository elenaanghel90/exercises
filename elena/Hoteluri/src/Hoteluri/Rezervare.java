package Hoteluri;

import java.time.LocalDate;

public class Rezervare {
    public enum TipCamera {DOUBLE, SINGLE}
    private LocalDate dataInceputSejur;
    private LocalDate dataFinalSejur;
    private TipCamera tipCamera;
    private Persoana titularRezervare;
    private int nrCamera;
    private Boolean micDejunInclus;
    private Boolean anulata = false;
    private int numarRezervare;

    private Hotel hotel;

    public Rezervare(){
        numarRezervare = (int) (Math.random()*100);
    }


    public int getNumarRezervare() {
        return numarRezervare;
    }

    public void setNumarRezervare(int numarRezervare) {
        this.numarRezervare = numarRezervare;
    }


    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }



    public Boolean getAnulata() {
        return anulata;
    }

    public void setAnulata(Boolean anulata) {
        this.anulata = anulata;
    }

    public Persoana getTitularRezervare() {
        return titularRezervare;
    }

    public void setTitularRezervare(Persoana titularRezervare) {
        this.titularRezervare = titularRezervare;
    }

    public LocalDate getDataInceputSejur() {
        return dataInceputSejur;
    }

    public void setDataInceputSejur(LocalDate dataInceputSejur) {
        this.dataInceputSejur = dataInceputSejur;
    }

    public LocalDate getDataFinalSejur() {
        return dataFinalSejur;
    }

    public void setDataFinalSejur(LocalDate dataFinalSejur) {
        this.dataFinalSejur = dataFinalSejur;
    }

    public TipCamera getTipCamera() {
        return tipCamera;
    }

    public void setTipCamera(TipCamera tipCamera) {
        this.tipCamera = tipCamera;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public void setNrCamera(int nrCamera) {
        this.nrCamera = nrCamera;
    }

    public Boolean getMicDejunInclus() {
        return micDejunInclus;
    }

    public void setMicDejunInclus(Boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "dataInceputSejur=" + dataInceputSejur +
                ", dataFinalSejur=" + dataFinalSejur +
                ", tipCamera=" + tipCamera +
                ", titularRezervare=" + titularRezervare.getNume() +
                ", nrCamera=" + nrCamera +
                ", micDejunInclus=" + micDejunInclus +
                ", anulata=" + anulata +
                ", numarRezervare=" + numarRezervare +
                ", hotel=" + hotel.getNume() +
                '}';
    }
}

