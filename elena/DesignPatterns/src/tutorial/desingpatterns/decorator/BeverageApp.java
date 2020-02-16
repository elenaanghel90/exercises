package tutorial.desingpatterns.decorator;

import javax.sound.midi.Soundbank;

public class BeverageApp {
    public static void main(String[] args) {
        Espresso espresso1 = new Espresso();
        Mocha mocha = new Mocha(espresso1);//decorez espresso cu mocha

        HouseBlend latte = new HouseBlend();
        Mocha mochaLatte=new Mocha(latte);
        Mocha doubleMochaLatte=new Mocha(mochaLatte);//decoram de doua ori cu mocha si ca sa decoram, folosim latte deja decorat o data cu mocha, adica mochaLatte
        Soy soyDoubleMocha = new Soy(doubleMochaLatte);
        Whip doubleMochaSoyLatteWithWhip = new Whip(soyDoubleMocha);
        System.out.println(" The price is " + doubleMochaSoyLatteWithWhip.cost() + "dollars, for beverage: " + doubleMochaSoyLatteWithWhip.getDescription());


//        Beverage dmslww = new Whip(new Soy(new Mocha(new Mocha(new HouseBlend())))); // acelasi tip de cafea ca doubleMochaSoyLatteWithWhip


//        DarkRoast caffee = new DarkRoast();
//        caffee.setMilk().setSoy();
//        System.out.println("The price is "+ caffee.cost()+" EUR");
    }

}
