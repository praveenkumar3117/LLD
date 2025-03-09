package ObserverPattern.Observable;

import ObserverPattern.Observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Youtube {
    private List<Subscriber> subscriberList = new ArrayList<>();
    private String videoTitle;

    public void add(Subscriber subscriber)
    {
        subscriberList.add(subscriber);
    }

    public void remove(Subscriber subscriber)
    {
        subscriberList.remove(subscriber);
    }

    public void uploadNewVideo(String videoTitle)
    {
        this.videoTitle=videoTitle;
        notifySubscribers();
    }

    public void notifySubscribers()
    {
        for(Subscriber sub : subscriberList)
        {
            sub.update();
        }
    }

    public String getVideoTitle()
    {
        return this.videoTitle;
    }


}
