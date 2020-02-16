package exercitii;

import java.util.Scanner;

public class Exe5TemaSapt2 {
    public static void main(String[] args) {
        String[] cuvinte = {" scaun ", " masa ", " usa ", " covor "};
        Scanner input = new Scanner(System.in);
        System.out.println(" Introduceti litera/ literele: ");
        String prefix = input.nextLine();


//alte moduri de a cauta primele litere dintr-un cuvant

//        for (String elem : cuvinte) {
//
//      if(elem.startsWith(prefix)){//
// System.out.println(elem);
//         }

//      if(elem.indexOf(text)==0){
//        System.out.println(elem);
//       }

// if ((elem.length<=text.length()) && elem.substring(0, text.length()).equals(text)){
// System.out.println(elem);    }
//
//        }



        for (int i = 0; i < cuvinte.length; i++) {
            if (cuvinte[i].trim().indexOf(prefix) == 0) { // cautam prin lista de cuvinte ca daca litera introdusa de noi se fla in pozitia 0 a cuvintelor din lista si trim ca sa stearga spatiile de inainte si dupa cuv
                System.out.println("Cuvantul care incepe cu litera introdusa de la tastatura: " + cuvinte[i]);
            }
        }
    }
}
