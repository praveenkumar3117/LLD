package ATMEasy;

public interface Authentication {
    int validate(Card card, int credentials);
}
