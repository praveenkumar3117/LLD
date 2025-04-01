package ATMEasy;

public class Card {
    private String cardNumber;
    private int pinAttempts=3;
    Card(String cardNumber)
    {
        this.cardNumber=cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPinAttempts() {
        return pinAttempts;
    }

    public void decreasePinAttempts()
    {
        pinAttempts--;
    }

    public boolean isBlocked()
    {
        return pinAttempts<=0;
    }
}
