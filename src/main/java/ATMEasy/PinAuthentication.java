package ATMEasy;

public class PinAuthentication implements Authentication {

    public int validate(Card card, int pin)
    {
        //fetch pin from DB for card and equate them
        //hardcoded for now
        if(card.isBlocked()) return -1;
        if(pin!=1234)
        {
            card.decreasePinAttempts();
            return card.isBlocked() ? -1 : 0;
        }
        return 1;
    }
}
