package tutorial.desingpatterns.decorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with whip ";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
