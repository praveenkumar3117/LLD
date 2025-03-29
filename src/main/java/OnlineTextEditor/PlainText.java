package OnlineTextEditor;

public class PlainText extends Text{
    String text;
    PlainText(String text)
    {
        this.text=text;
    }
    @Override
    public String getText() {
        return text;
    }
}
