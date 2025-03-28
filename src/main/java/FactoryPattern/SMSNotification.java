package FactoryPattern;

public class SMSNotification implements Notification{
    @Override
    public void notifyUsers() {
        System.out.println("This is SMS notification");
    }
}
