package FactoryPattern;

public class EmailNotification implements Notification{
    @Override
    public void notifyUsers()
    {
        System.out.println("This is Email Notification");
    }
}
