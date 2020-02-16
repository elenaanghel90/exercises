public class String1 {
    public static void main(String[] args) {
        String nume ="Ion";
        String prenume = new String ("Marian");

        System.out.println( nume.toUpperCase() + " " + prenume); //am pus ca numele sa fie scris lu litere mari
        nume = nume.toUpperCase();
        System.out.println(nume);
        System.out.println(" " + nume.charAt(0) + nume.charAt(1)); //daca nu spunem sptiul din afat ne afiseaza un numar, deoarece converteste la valoare numerica
        System.out.println(" " + nume.charAt(0) + (int)nume.charAt(1)); //am facut CAST pentru a doua litera din nume
        System.out.println( nume + " lungime " + nume.length()); //lungimea numelui
    }
}
