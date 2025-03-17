package DecoratorPattern;

import java.util.Objects;

public class ColdDrinkAddOn extends AddOnDecorator{
    BasePizza basePizza;
    String coldDrink;
    ColdDrinkAddOn(BasePizza basePizza, String coldDrink)
    {
        this.basePizza=basePizza;
        this.coldDrink=coldDrink;
    }

    @Override
    public int cost() {
        int coldDrinkPrice=0;
        if(Objects.equals(coldDrink, "PEPSI")) coldDrinkPrice=50;
        if(Objects.equals(coldDrink, "COKE")) coldDrinkPrice=60;
        if(Objects.equals(coldDrink, "DEW")) coldDrinkPrice=40;
        System.out.println("Price of coldDrink " + coldDrinkPrice);
        return coldDrinkPrice + this.basePizza.cost();
    }
}
