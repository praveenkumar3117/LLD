package AbstractFactoryPattern;

public class Main {
    public static void main (String [] args)
    {
        GUIFactory windowsFactory = new WindowsFactory();
        Button button = windowsFactory.createButton();
        CheckBox checkBox = windowsFactory.createCheckBox();
        button.click();
        checkBox.select();
        GUIFactory macFactory = new MacFactory();
        button = macFactory.createButton();
        checkBox = macFactory.createCheckBox();
        button.click();
        checkBox.select();
    }
}
