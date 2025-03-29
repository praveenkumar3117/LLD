package AbstractFactoryPattern;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("This is mac button");
    }
}
