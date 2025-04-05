package ObserverPattern.Observer;

import ObserverPattern.Observable.Youtube;
import ObserverPattern.Observable.YoutubeChannel;

public class EmailUser implements Subscriber{
    private String emailId;
    public EmailUser(String emailId)
    {
        this.emailId=emailId;
    }

    @Override
    public void update(YoutubeChannel youtubeChannel) {
        System.out.println("Hey email subscriber " + emailId + ", there is a new video "  +  "on " + youtubeChannel.getName() +" " + youtubeChannel.getVideoTitle() +", please check");
    }
}
