package utile.sda;

public class Biti {
    public static void main(String[] args) {
        //int nr = 0x15;//echivalent cu 21

        int nr = 15;
        System.out.println(nr + " in hexa: 0x" + Integer.toHexString(nr)); //0x e baza 16
        System.out.println(nr + " in binar: 0b" + Integer.toBinaryString(nr));//afisare in baza 2
        nr = nr << 2;
        System.out.println(nr + " in binar: 0b" + Integer.toBinaryString(nr));//shiftat la stanga (nr inmultit cu 2)
        nr >>= 1; // nr=nr >> 1
        System.out.println(nr + " in binar: 0b" + Integer.toBinaryString(nr));//shiftat la dreapta (nr impartit la 2)

        nr = 15 & 30;
        System.out.println(Integer.toBinaryString(15) + "\n" + Integer.toBinaryString(30));
        System.out.println(nr + " in binar: 0b" + Integer.toBinaryString(nr));
    }
}
