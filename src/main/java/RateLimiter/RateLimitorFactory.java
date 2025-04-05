package RateLimiter;

public class RateLimitorFactory {

    public static RateLimiter createRateLimitor(String type)
    {
        return switch (type) {
            case "fixed" -> new LinkedListStrategy();
            case "tokenbucket" -> new TokenBucketStrategy();
            default -> new TokenBucketStrategy();
        };
    }
}
