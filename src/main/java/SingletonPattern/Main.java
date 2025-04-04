package SingletonPattern;

public class Main {
    public static void main(String [] args)
    {
        Logger logger1 = Logger.getLogger();
        logger1.log("This is first log message");
        Logger logger2 = Logger.getLogger();
        logger2.log("This is another log message");
    }
}
