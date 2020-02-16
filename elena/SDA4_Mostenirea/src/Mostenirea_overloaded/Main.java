package Mostenirea_overloaded;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina(200);
        Bicicleta bicicleta = new Bicicleta();
        Mecanic mecanic = new Mecanic();

//        Vehicul bicicleta2 = new Bicicleta(30);
//        Mecanic mecanic = new Mecanic();
//        mecanic.repara(masina);
//        mecanic.repara(bicicleta);
//        mecanic.repara(bicicleta2);

        masina.defectiune();
        bicicleta.defectiune();
        System.out.println("Masina are starea: " + masina.raportStare());
        System.out.println("Bicicleta are starea: " + bicicleta.raportStare());

        masina.defectiune();
        bicicleta.defectiune();
        System.out.println("Masina are starea: " + masina.raportStare());
        System.out.println("Bicicleta are starea: " + bicicleta.raportStare());

        mecanic.repara(masina);
        mecanic.repara(bicicleta);
        System.out.println("Masina are starea: " + masina.raportStare());
        System.out.println("Bicicleta are starea: " + bicicleta.raportStare());

    }
}
