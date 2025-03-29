package AbstractFactoryPattern;

public class MacCheckbox implements CheckBox{
    @Override
    public void select() {
        System.out.println("This is mac checkBox");
    }
}
