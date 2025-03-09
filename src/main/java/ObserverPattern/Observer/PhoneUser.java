package ObserverPattern.Observer;

import ObserverPattern.Observable.Youtube;
import ObserverPattern.Observable.YoutubeChannel;

public class PhoneUser implements Subscriber{

    private String phoneNumber;
    private Youtube youtubeChannel;
    public PhoneUser(String phoneNumber, Youtube youtubeChannel)
    {
        this.phoneNumber=phoneNumber;
        this.youtubeChannel=youtubeChannel;

    }

    @Override
    public void update() {
        System.out.println("Hey phone user "+phoneNumber +" there is a new video" + youtubeChannel.getVideoTitle() + ", please check");
    }
}
