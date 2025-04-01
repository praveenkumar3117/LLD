package ATMEasy;

public class Main {
    public static void main(String [] args)
    {
        Card card = new Card("1234567890");
        Authentication authentication = new PinAuthentication();
        UserAccount userAccount = new UserAccount(card);
        ATM atm = new ATM(card, authentication, userAccount);


        if(atm.validate(1234)==1)
        {
            System.out.println("Your bank balance is " + atm.checkBalance());
            System.out.println("Exiting the system");
        }
        else {
            System.out.println("Incorrect PIN");
        }

        if(atm.validate(1234)==1)
        {
            if(atm.withDrawBalance(1000))
            {
                System.out.println("Withdraw success");
                System.out.println("Current Balance "+atm.checkBalance());
            }
            else {
                System.out.println("Insufficient bank balance");
            }
        }
        else
        {
            System.out.println("Incorrect PIN");
        }
        if(atm.validate(1234)==1)
        {
            if(atm.withDrawBalance(9001))
            {
                System.out.println("Withdraw success");
                System.out.println("Current Balance "+atm.checkBalance());
            }
            else {
                System.out.println("Insufficient bank balance");
            }
        }
        else
        {
            System.out.println("Incorrect PIN");
        }

        int pinAttempt1 = atm.validate(1345);
        if(pinAttempt1==-1)
        {
            System.out.println("You have entered your pin 3 times wrong, your card is blocked");
        }
        else
        {
            if(pinAttempt1==0)
            {
                System.out.println("Incorrect PIN");
            }
            else {
                System.out.println("Your bank balance is " + atm.checkBalance());
            }
        }
        int pinAttempt2 = atm.validate(1456);
        int pinAttempt3 = atm.validate(12345);
        if(pinAttempt3==-1)
        {
            System.out.println("You have entered your pin 3 times wrong, your card is blocked");
        }
        else
        {
            if(pinAttempt3==0)
            {
                System.out.println("Incorrect PIN");
            }
            else {
                System.out.println("Your bank balance is " + atm.checkBalance());
            }
        }



        Card card1 = new Card("0987654321");
        Authentication authentication1 = new OtpAuthentication();
        UserAccount userAccount1 = new UserAccount(card1);
        ATM atm1 = new ATM(card1, authentication1, userAccount1);
        if(atm1.validate(7777)==1)
        {
            System.out.println("This is you current balance ji "+ userAccount1.checkBalance());
            if(atm1.withDrawBalance(1100))
            {
                System.out.println("Successful withdrawal, current bank balance "+ userAccount1.checkBalance());
            }
            else {
                System.out.println("Insufficient bank balance");
            }
        }
        else
        {
            System.out.println("Otp is incorrect");
        }
    }
}
