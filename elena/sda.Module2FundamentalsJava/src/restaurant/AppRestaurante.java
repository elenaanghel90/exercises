package restaurant;

import java.util.Scanner;

public class AppRestaurante {
    public static void main(String[] args) {
        Restaurant italian = new Restaurant("Restaurant Italian", 9, new Meniu(new String[]{"pizza", "paste"}, new double[] {32.5, 15.0}));
        Restaurant romanesc = new Restaurant("Restaurant romanesc", 10, new Meniu(new String[]{"ciorba", "friptura"}, new double[] {12.4, 24.0}));
        Restaurant american = new Restaurant("Restaurant American", 8, new Meniu(new String[]{"burgeri", "sandvis"}, new double[] {35, 20}));

        Restaurant[] restaurants = new Restaurant[]{italian, romanesc, american};

        for (Restaurant r : restaurants) {
            System.out.println(r);
            int lungimeaListeiDePreturiDinMeniulRestaurantului = r.meniu.preturi.length;
            System.out.println(lungimeaListeiDePreturiDinMeniulRestaurantului);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti felul de mancare dorit: ");
        String mancareCautata = input.nextLine();

        for (Restaurant r : restaurants) {
            Meniu meniu = r.getMeniu();
            if (meniu.contineTipMancare(mancareCautata)) {
                System.out.println(r);
            }
        }
    }
}
