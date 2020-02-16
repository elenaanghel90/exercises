public class String2 {
    public static void main(String[] args) {
        String nume = "Ion";
        String prenume = new String("Marian");
        String text = "Plec in vacanta la mare!";
        int contor = 0;

        while (contor < text.length()){
            System.out.print(text.charAt(contor) + "-");
            contor++;
        }

    }
}