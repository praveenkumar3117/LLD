package ObserverPattern.Observer;

import ObserverPattern.Observable.Youtube;
import ObserverPattern.Observable.YoutubeChannel;

public class EmailUser implements Subscriber{
    private String emailId;
    private Youtube youtubeChannel;
    public EmailUser(String emailId, Youtube youtubeChannel)
    {
        this.youtubeChannel=youtubeChannel;
        this.emailId=emailId;
    }

    @Override
    public void update() {
        System.out.println("Hey email subscriber " + emailId + ", there is a new video " + youtubeChannel.getVideoTitle() +", please check");
    }
}
