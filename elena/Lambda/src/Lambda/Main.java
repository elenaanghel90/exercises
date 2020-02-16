package Lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Function<String, Integer>lambdaExp= s -> s.length(); //integer al doilea pantru ca intoarce un param de tip integer
        // Integer size1 = lambdaExp.apply("Aici este un integer ");
        //        System.out.println(size1);


        Function<String, String>replaceExp= s -> {
        String aux=s.replace("  "," ");//inlocuiesti doua spatii cu un spatiu
        while(aux.contains("  ")){ //cat timp inca mai sunt doua spatii,inlocuim 2 spatii cu un spatiu
            aux=aux.replace("  ", " ");
        }
        return aux; };

        Function<String, Integer> sizeExp = s-> s.length();
        String res = replaceExp.apply("t  t   ");
        System.out.println(">>>>" + res + "<<<<<");
        Integer size = sizeExp.apply(replaceExp.apply(res));
        System.out.println(size);

    }

}