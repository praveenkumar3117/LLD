package ATMEasy;

public class ATM {
    private Card card;
    private Authentication userAuthentication;
    private UserAccount userAccount;
    ATM(Card card, Authentication userAuthentication, UserAccount userAccount)
    {
        this.card =  card;
        this.userAuthentication = userAuthentication;
        this.userAccount = userAccount;
    }

    public int validate(int credentials )
    {
        return userAuthentication.validate(card, credentials);
    }

    public int checkBalance()
    {
        return userAccount.checkBalance();
    }

    public boolean withDrawBalance(int amount)
    {
        return userAccount.withDrawBalance(amount);
    }
}
