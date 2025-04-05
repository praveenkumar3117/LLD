package ObserverPattern.Observer;

import ObserverPattern.Observable.Youtube;
import ObserverPattern.Observable.YoutubeChannel;

public interface Subscriber {
    public void update(YoutubeChannel youtubeChannel);
}
