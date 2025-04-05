package ObserverPattern.Observer;

import ObserverPattern.Observable.Youtube;
import ObserverPattern.Observable.YoutubeChannel;

public class PhoneUser implements Subscriber{

    private String phoneNumber;
    public PhoneUser(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;


    }

    @Override
    public void update(YoutubeChannel youtubeChannel) {

        System.out.println("Hey phone user "+phoneNumber +" there is a new video" +  "on " + youtubeChannel.getName() +" " +youtubeChannel.getVideoTitle() + ", please check");

    }
}
