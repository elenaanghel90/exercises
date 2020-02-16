public class Main {
    public static void main(String[] args) {
//        Lista1 listaTest = new Lista1();
//        listaTest.add("ceva");
//        listaTest.add("ceva2");
//        listaTest.add("ceva3");
//        System.out.println(listaTest.toString());
//
//        listaTest.remove(0);
//        System.out.println(listaTest.toString());
//        System.out.println(listaTest.get(1));


        Lista1<Integer> listOfIntegers = new Lista1<>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        System.out.println(listOfIntegers.toString());

        Lista1<String>listOfString = new Lista1<>();
        listOfString.add("Ana");
        System.out.println(listOfString.toString());


//        listaTest.remove(0); //stergem ultimul elem
//        System.out.println(listaTest.toString());
//
//
//        listaTest.remove(0);
//        System.out.println(listaTest.toString());
    }
}
