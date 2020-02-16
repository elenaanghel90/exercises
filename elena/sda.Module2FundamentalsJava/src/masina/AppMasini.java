package masina;

public class AppMasini {
    public static void main(String[] args) {
        Masina[] masini = new Masina[3];
        masini[0] = new BMW() ;
        masini[1] = new Dacia("alba", 6);
        masini[2] = new VW();

        for (Masina m : masini) {
            m.franeaza();
            m.parcheaza();
            m.claxoneaza();
            System.out.println(m);
            System.out.println();
        }
        //for(int i=0; i < masini.length; i++){
        // masina.Masina m = masina[i];
        // m.franeaza();
        // m.claxoneaza();
        // m.claxoneaza();}
    }
}
