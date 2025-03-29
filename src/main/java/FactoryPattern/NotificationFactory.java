package FactoryPattern;

public class NotificationFactory {

    public  static Notification createNotification(String inputType)
    {
        return switch (inputType) {
            case "SMS" -> new SMSNotification();
            case "Email" -> new EmailNotification();
            default -> new NullNotification();
        };
    }
}
