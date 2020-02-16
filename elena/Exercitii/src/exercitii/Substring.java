package exercitii;

public class Substring {
    public static void main(String[] args) {
        String cuvant="  abcd   efgh ";

        System.out.println(cuvant +"substring(0,1):" + cuvant.substring(0,1));
        System.out.println(cuvant +"substring(2,5):" + cuvant.substring(2,5));
        System.out.println(cuvant +"substring(1):" + cuvant.substring(1));
        System.out.println(cuvant +"starts with abc: " + cuvant.trim().startsWith("abc")); //afiseaza daca cuvantul incepe cu abc sub forma de true or false
        System.out.println(cuvant +"replace a cu X:" + cuvant.replace("a", "x"));
        System.out.println(cuvant +"replace: " + cuvant.trim().replace(" ","")); //scoatem spatiul din mijlocul cuvantului
    }
}
