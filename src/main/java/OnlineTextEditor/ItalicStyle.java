package OnlineTextEditor;

public class ItalicStyle extends StylesDecorator{
    Text text;
    ItalicStyle(Text text)
    {
        this.text= text;
    }
    @Override
    public String getText() {
        return text.getText() + " Italic added";
    }
}
