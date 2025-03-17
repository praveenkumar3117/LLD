package DecoratorPattern;

public class OliveAdd extends ToppingsDecorator{
    BasePizza basePizza;
    OliveAdd(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return 35 + this.basePizza.cost();
    }
}
