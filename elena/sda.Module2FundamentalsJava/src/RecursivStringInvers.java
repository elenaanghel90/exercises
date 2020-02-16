public class RecursivStringInvers {
    public static void main(String[] args) {
        String cuvant = "Elena";
        System.out.println(stringInvers(cuvant.length()-1,cuvant));
        System.out.println(stringInvers2(0, cuvant));
    }

    public static String stringInvers(int position, String orig) {
        if (position < 0) {
            return "";
        }
            else {
            return orig.charAt(position) + stringInvers(position - 1, orig);
        }
    }
    public static String stringInvers2(int position, String orig){
        if(position == orig.length()){
            return "";
        }
        else {
            return stringInvers2(position+1, orig)+orig.charAt(position);
        }
    }
    }
