package masina;

import masina.Masina;

public class BMW extends Masina {

    public BMW(){
        super("rosu",4);
    }

    @Override
    public void franeaza(){
        System.out.println("Franez din masina.BMW!");
    }
    public String toString(){
        return super.toString() + ". Sunt un masina.BMW!"; //copiem toString din clasa
    }
}
