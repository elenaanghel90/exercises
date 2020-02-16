package utile.sda;

import elevi.sda.Elev; //in loc de sda.Elev se poate pune * si acceseasa tot

public class Main {

    public static void main(String[] args) {
	Bicicleta bike1 = new Bicicleta("Focus", 10, "Alba");
	Bicicleta bike2 = new Bicicleta("DHS", 15, "rosie");
//        System.out.println(" A creat " + Bicicleta.getCount() + " biciclete");
//        System.out.println(" A creat " + Bicicleta.numarTotal + " biciclete");
//        bike1.setProducator("Cube");
//        System.out.println(" Bike1 are culoarea: " + bike1.culoare + " si e marca: " + bike1.getProducator());


        Elev elev1= new Elev ("Ionescu Marin");
        Elev elev2= new Elev ("Popescu Ion");
        Elev elev3=elev2;  ///nu s-a apelat contructorul new, i-am atribuit notele elevului 2
        System.out.println("Avem " + Elev.nrElevi + " elevi!");
        elev1.setNotaMate(8);
        elev1.setNotaRomana(10);
        elev1.setBike("Merida", "negru", 20);

        elev3.setNotaMate(5);
        elev3.setNotaRomana(5);
        elev2.setBike("Cube","alb", 12);

        System.out.println("Media lui " + elev1.getNume() + " este " + elev1.medie() + " si bicicleta lui este: "+ elev1.bikeToString());
        System.out.println("Media lui " + elev2.getNume() + " este " + elev2.medie());




    }
}
