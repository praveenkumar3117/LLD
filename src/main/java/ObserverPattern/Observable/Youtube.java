package ObserverPattern.Observable;

import ObserverPattern.Observer.Subscriber;

public interface Youtube {
    void add(Subscriber subscriber);
    void remove(Subscriber subscriber);
    void uploadNewVideo(String videoTitle);
    void notifySubscribers();
    String getVideoTitle();


}
