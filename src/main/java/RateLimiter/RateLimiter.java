package RateLimiter;

public interface RateLimiter {
    public boolean allowRequest(User user);
}
