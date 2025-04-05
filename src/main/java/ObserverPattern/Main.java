package ObserverPattern;

import ObserverPattern.Observable.Youtube;
import ObserverPattern.Observable.YoutubeChannel;
import ObserverPattern.Observer.EmailUser;
import ObserverPattern.Observer.PhoneUser;
import ObserverPattern.Observer.Subscriber;

public class Main {
    public static void main(String [] args)
    {
        Youtube youtubeChannel = new YoutubeChannel("R2H");
        YoutubeChannel youtubeChannel1 = new YoutubeChannel("Carry Minati");

        Subscriber phoneUser = new PhoneUser("9588338712");
        Subscriber phoneUser1 = new PhoneUser("1234567890");
        Subscriber emailUser = new EmailUser("sainipraveen@gmail.com");
        Subscriber emailUser1 = new EmailUser("pk@gmail.com");

        //Adding subscribers to the channel
        youtubeChannel.add(phoneUser);
        youtubeChannel.add(phoneUser1);
        youtubeChannel.add(emailUser);
        youtubeChannel.add(emailUser1);

        //uploading a video and notifying subs
        youtubeChannel.uploadNewVideo("Aabraaaaa kaaaaa daabraaaaaaa");

        //testing if removing subs works or not
        youtubeChannel.remove(phoneUser);
        youtubeChannel.remove(emailUser1);
        youtubeChannel.notifySubscribers();


        youtubeChannel1.add(phoneUser);

        youtubeChannel1.uploadNewVideo("Kelllaaaaaaaa");


    }
}
