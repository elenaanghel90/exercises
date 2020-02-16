package animale;

public class AppAnimale {
    public static void main(String[] args) {
        Mamifere pisicaSiameza = new Mamifere("alba", "Pisi", 3, "lunga", 4);
        Mamifere labrador = new Caini("neagra", "Azorel", 4, "creata", 4);
        Pasari papagalVorbitor = new Papagal("multicolor", "Kiki", 1, "scurti", 12);

        Animal[] animals = new Animal[]{pisicaSiameza, labrador, papagalVorbitor};

        for (Animal a : animals) {
            System.out.println(a);
        }


    }
}
