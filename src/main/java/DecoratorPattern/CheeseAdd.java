package DecoratorPattern;

public class CheeseAdd extends ToppingsDecorator{
    BasePizza basePizza;
    CheeseAdd(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return 15 + this.basePizza.cost();
    }
}
