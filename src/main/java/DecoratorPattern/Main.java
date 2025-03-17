package DecoratorPattern;

public class Main {

    public static void main(String [] args)
    {
        BasePizza pizza = new FarmHousePizza();
        System.out.println("This is cost of FarmHousePizza "+pizza.cost());
        pizza = new OliveAdd(pizza);
        System.out.println("This is cost of FarmHousePizza with olives "+pizza.cost());
        pizza = new CheeseAdd(pizza);
        System.out.println("This is cost of FarmHousePizza with olives + cheese "+pizza.cost());


        //Try to make a pizza and add a coldDrink
        BasePizza pizza1 = new PaneerPizza();
        System.out.println("This is cost of paneerPizza " + pizza1.cost());
        pizza1 = new ColdDrinkAddOn(pizza1,"DEW");
        System.out.println("This is cost of paneerPizza with DEW " + pizza1.cost());

    }
}
