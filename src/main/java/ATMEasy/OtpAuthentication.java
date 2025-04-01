package ATMEasy;

public class OtpAuthentication implements Authentication{
    @Override
    public int validate(Card card, int otp) {
        //fetch otp from you external service and equate it with user otp
        //for now i am hardcoding it to 7777
        if(otp==7777) return 1;
        return 0;
    }
}
