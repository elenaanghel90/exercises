import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String nume = "Marin Popescu";
        String[] cuvinte = {"  casA ", "masa ", " Masina  ", " OBuz "};
        String rezultat = String.join(",", cuvinte); //join se foloseste sa unesti sirul
        System.out.println("rezultat= " + rezultat);

        String[] split = rezultat.split (",");
        System.out.println("split= " + Arrays.toString(split));

       // rezultat = rezultat.replace('a', 'X');
        //System.out.println("rezultat dupa replace = " + rezultat); //inlocuirea unuei cifre

        rezultat = rezultat.replace("casA", "URA!");
        System.out.println("rezultat dupa replace = " + rezultat);

        System.out.println("MAsina e la indexul:" +
                rezultat.indexOf("Masina"));

        for (String cuvant : cuvinte) {
            String rez = cuvant.trim();//trim le aliniaza de la margine ca sa fie primul caracter in pozitia zero


            System.out.println("nume = " + nume.substring(2, 8)); //incepe la 2 si se opreste la 8
            System.out.println("nume = " + nume.substring(4)); //se opreste la finalul stringului
            rez = rez.trim().substring(0, 1).toUpperCase() + //0 si 1 ca sa trateze prima litera care e in poz 0
                    rez.substring(1).toLowerCase();

            System.out.println(rez);
        }
    }
}

