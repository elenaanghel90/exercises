package masina;

public class Masina {//clasa

    protected String culoare; //atribute sau proprietati
    protected int nrRoti;

    public Masina(){
        this.culoare = "Neagra";
        this.nrRoti = 4;
    }

    public Masina(String culoare, int nrRoti){ //stare
        this.culoare = culoare;
        this.nrRoti = nrRoti;
    }


    protected void franeaza(){ //comportament/ behaviour
        System.out.println("Franez din masina!");
    }
    public void parcheaza(){ //comportament/ behaviour
        System.out.println("Parchez din masina!");
    }
    public void claxoneaza(){ //comportament/ behaviour
        System.out.println("Claxonez din masina!");
    }

    @Override
    public String toString(){ //returneaza un string reprezentat pe obiect. In general metoda toString returneaza un string care textual repr acel obiect
        return "Salut! Sunt o masina si am culoarea "
                + this.culoare + " dar am si " + this.nrRoti +" roti";
    }

}