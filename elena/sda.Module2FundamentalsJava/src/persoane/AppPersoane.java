package persoane;

import persoane.Persoana;
import persoane.Profesor;

import java.util.Scanner;

public class AppPersoane {
    public static void main(String[] args) {
        Persoana[] persoane = new Persoana[3];
        persoane[0] = new Profesor("Ciocodei  ", "Alexandru", 33, "facultate");
        persoane[1] = new Student("Ciuca", "Emanuel", 22, "liceu");
        persoane[2] = new Student("Anghel", "Andi", 23, "liceu");
        ((Student) persoane[1]).setGrupa(3);
        ((Student) persoane[1]).setScoala("Universitatea Cantemir");
        ((Student) persoane[1]).setSpecialitate("Chimie");

        ((Student) persoane[2]).setGrupa(1);
        ((Student) persoane[2]).setScoala("Universitatea Bucuresti");
        ((Student) persoane[2]).setSpecialitate("Informatica");

        ((Profesor) persoane[0]).setGrad("Conferentiar");
        ((Profesor) persoane[0]).setMaterie("Chimie");

        for (Persoana m : persoane) {
            m.studiaza();
            m.preda();
            System.out.println(m);
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
        System.out.println(" Introduceti numele dorit: ");
        String numeleCautat = input.nextLine();

        int counter = 0;
        for (Persoana s : persoane) {
            if (s.nume.trim().equalsIgnoreCase(numeleCautat.trim())) {
                System.out.println(s.nume + " " + s.prenume);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("nu exista in lista");
        }
    }

}
