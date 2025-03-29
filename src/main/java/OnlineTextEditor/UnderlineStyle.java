package OnlineTextEditor;

public class UnderlineStyle extends StylesDecorator{

    Text text;
    UnderlineStyle(Text text)
    {
        this.text=text;
    }
    @Override
    public String getText() {
        return text.getText() + " Underline added";
    }
}
