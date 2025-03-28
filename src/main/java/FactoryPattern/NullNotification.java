package FactoryPattern;

public class NullNotification implements Notification{
    @Override
    public void notifyUsers() {
        System.out.println("This is default notification");
    }
}
