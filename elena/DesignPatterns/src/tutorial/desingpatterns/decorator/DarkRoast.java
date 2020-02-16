package tutorial.desingpatterns.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Most excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }

}
