package SingletonPattern;

public class LazyImplementation {

    private static LazyImplementation logger;

    // make its constructor private to prevent instantiation
    private LazyImplementation(){}

    public static  LazyImplementation getInstance()
    {
        if(logger==null)
        {
            logger = new LazyImplementation();
        }
        return logger;
    }

    public void log(String message)
    {
        System.out.println(message);
    }
}
