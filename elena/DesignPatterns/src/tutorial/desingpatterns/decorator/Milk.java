package tutorial.desingpatterns.decorator;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk ";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
