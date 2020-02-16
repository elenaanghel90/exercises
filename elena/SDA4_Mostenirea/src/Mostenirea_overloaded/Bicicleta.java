package Mostenirea_overloaded;

public class Bicicleta extends Vehicul {
    enum StareBicicleta {OK, DEFECT_MINOR, DEFECT_MAJOR, INUTILIZABILA} //starea..asa se declara

    private StareBicicleta stare;

    public Bicicleta() {
        super(40); //sau this(40); ca sa setezi vitezaMaxima 40 fara a afecta viteza maxima a masinii
        stare = StareBicicleta.OK;
    }

    public void repara() {
        stare = StareBicicleta.OK;
    }

    public void defectiune() {
        switch (stare) {
            case OK:
                stare = StareBicicleta.DEFECT_MINOR;
                break;
            case DEFECT_MINOR:
                stare = StareBicicleta.DEFECT_MAJOR;
                break;
            case DEFECT_MAJOR:
                stare = StareBicicleta.INUTILIZABILA;
                break;
            default:
                break;
        }
    }

//    public Bicicleta(Integer vitezaMaxima) {
//        super(vitezaMaxima);
//        stare = true;
//    }

    public StareBicicleta raportStare() {
        return stare;
    }
}
