package SingletonPattern;

public class Logger {

    private static Logger logger = new Logger();

    //make its constructor private, so that it can't be instantiated
    private Logger(){}

    //provide global access point to access the logger
    public static Logger getLogger()
    {
        return Logger.logger;
    }

    public void log(String message)
    {
        System.out.println(message);
    }
}
