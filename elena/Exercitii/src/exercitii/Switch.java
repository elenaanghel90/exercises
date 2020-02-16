package exercitii;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char direction = 'a';
        while (direction != 'q') {
            direction = input.next().charAt(0);

            switch (direction) {

                case 'n':
                case 'N':
                    System.out.println("You are going North");
                    break;
                case 's':
                case 'S':
                    System.out.println("You are going South");
                    //break;
                case 'e':
                    System.out.println("You are going East");
                    break;
                case 'w':
                    System.out.println("You are going West");
                    break;
                case 'x':
                case 'y':
                case 'z':
                    return;

                default:
                    System.out.println("Bad direction!");
            }
        }
    }
}