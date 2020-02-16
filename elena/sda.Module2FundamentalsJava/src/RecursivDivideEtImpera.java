public class RecursivDivideEtImpera {
    public static void main(String[] args) {
        int[] sir = {2, 3, 4, 5, 6, 7, 8};
        System.out.println(divideEtImpera(sir ,0, sir.length-1, 4));
    }

    public static int divideEtImpera(int[] sir, int primaJumatate, int aDouaJumatate, int find){

        if(primaJumatate > aDouaJumatate){
            return -1;
        }
        int mijloc = primaJumatate + (aDouaJumatate - primaJumatate)/2;

        if(find == sir[mijloc]){
            return mijloc;
        }
        if(find < sir[mijloc]){
            return divideEtImpera(sir, primaJumatate, mijloc, find);
        }

        if(find > sir[mijloc]){
            return divideEtImpera(sir, mijloc+1, aDouaJumatate, find);
        }
        return -1;
    }
}
