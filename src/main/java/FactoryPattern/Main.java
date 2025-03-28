package FactoryPattern;

public class Main {
    public static void main(String [] args)
    {
        //creating the notification factory here


        //creating a notification on the basis of input
        Notification notification = NotificationFactory.createNotification("SMS");

        //notifyUsers
        notification.notifyUsers();
        notification = NotificationFactory.createNotification("Email");
        notification.notifyUsers();

        notification=NotificationFactory.createNotification("PK");
        notification.notifyUsers();
    }

}
