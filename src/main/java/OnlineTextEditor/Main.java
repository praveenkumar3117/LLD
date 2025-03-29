package OnlineTextEditor;

public class Main {
    public static void main(String [] args)
    {
        Text text =new PlainText("Praveen Saini");
        System.out.println(text.getText());
        text = new BoldStyle(text);
        System.out.println(text.getText());
        text = new ItalicStyle(text);
        System.out.println(text.getText());
        text = new UnderlineStyle(text);
        System.out.println(text.getText());
        text = new BoldStyle(text);
        System.out.println(text.getText());


    }
}
