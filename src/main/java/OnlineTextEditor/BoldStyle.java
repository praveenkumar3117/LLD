package OnlineTextEditor;

public class BoldStyle extends StylesDecorator{

    Text text;
    BoldStyle(Text text)
    {
        this.text=text;
    }

    @Override
    public String getText() {
        return text.getText()+" Bold Style Added";
    }
}
