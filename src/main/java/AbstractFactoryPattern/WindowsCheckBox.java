package AbstractFactoryPattern;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void select() {
        System.out.println("This is windows checkbox");
    }
}
