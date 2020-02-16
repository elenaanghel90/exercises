package utile.sda;

import exercitii.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//nr e par sau nu

public class MetodeEx1 {
    public static void main(String[] args) {

        int x=10, y = 6;
        boolean b;
        Calcule obj1 = new Calcule(15, 10);
        Calcule obj2 = new Calcule(-100, 5);

        b= ePar(x);
        System.out.println(" Numarul e par: " + b);
        //obj1.valoare = -5;
        System.out.println("x + y = " + Calcule.suma(x, y));
        System.out.println("x + y - obj1.val= " + obj1.diferenta(x, y));//nu o putem apela pentru ca metoda "diferenta" nu e static si am apelat-o prin intermediul unui obiect
        System.out.println("x + y - obj2.val= " + obj2.diferenta(x, y));
        System.out.println("Valoarea din obj1 e pozitiva: " + obj1.ePozitiv());
        System.out.println("Valoarea din obj2 e pozitiva: " + obj2.ePozitiv());
        System.out.println("obj1.sir: " +Arrays.toString(obj1.sir)); //afiseaza vectorul random
        Arrays.sort(obj1.sir); //sorteaza vectorul
        System.out.println("obj1.sir: " +Arrays.toString(obj1.sir));//afiseaza vectorul sortat

        int[] sirNou;
       sirNou= Arrays.copyOf(obj1.sir, 5); //copiem un sir pentru care putem seta lungimea pe care sa o copieze
        System.out.println("sir nou; " + Arrays.toString(sirNou));


    }
    public static boolean ePar (int nr){
        if (nr % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
class Calcule {
    int valoare;
    int[] sir;
    public Calcule (int val, int lungime){ //constructor
        this.valoare = val;
        this.sir = new int[lungime];
        Arrays.fill(this.sir, val);
        Random r =new Random();
        int i =0;
        for(i =0; i<this.sir.length;i+=1){
            this.sir[i] = r.nextInt(51);
        }

    }
    static int suma (int a, int b){
        return a + b;
    }
    int diferenta (int a, int b){
        return a-b- valoare;
    }
    boolean ePozitiv(){
        if (valoare > 0)
        {
            return true;}
            else {
                return false;}
    }
    }

