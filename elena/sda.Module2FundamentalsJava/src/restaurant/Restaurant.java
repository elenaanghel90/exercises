package restaurant;

public class Restaurant {
    public static int CAPACITATE_MAXIMA = 100;
    private String nume;
    private int rating;
    public Meniu meniu;

    public Restaurant(String nume, int rating, Meniu meniu){
        this.nume = nume;
        this.rating = rating;
        this.meniu = meniu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Meniu getMeniu() {
        return meniu;
    }

    public void setMeniu(Meniu meniu) {
        this.meniu = meniu;
    }

    public String toString(){
        return nume + "\t " + rating + "\t" + meniu;
    }
}
