package ATMEasy;

public class UserAccount {
    private int balance;
    UserAccount(Card card)
    {
        //use card to fetch the bank balance and set it. for now it is hardcoded
        this.balance=10000;
    }
    public int checkBalance()
    {
        //fetch bank balance
        //hardcoded for now
        return balance;
    }

    public boolean withDrawBalance( int amount)
    {
        if(amount<=balance)
        {
            balance-=amount;
            return true;
        }
        return false;
    }
}
