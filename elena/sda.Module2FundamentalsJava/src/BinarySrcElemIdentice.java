public class BinarySrcElemIdentice {
    public static void main(String[] args) {
        int[] sir = {6, 5, 8, 6, 5, 3, 4, 5, 10};
        int[] sirVizitat = new int[sir.length];
        System.out.println();

        for (int i = 0; i < sir.length; i++) {
            int contor = 1;
            if (sirVizitat[i] != 1) {
                for (int j = i + 1; j < sir.length; j++) {
                    if (sir[i] == sir[j]) {
                        sirVizitat[j] = 1; //1 inseamna ca valoarea a fost vizitata, adica unde ai gasit de ex pe 6 in sir si marchezi pozitia cu 1
                        contor++;
                    }

                }
                System.out.println("The element: " + sir[i] + " is present in array of " + contor + " times");
            }
        }
    }
}



