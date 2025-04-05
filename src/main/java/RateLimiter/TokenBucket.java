package RateLimiter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenBucket {
    private double tokens;
    private double capacity;
    private double refillRate;
    private long lastRefillTimeStamp;
    TokenBucket(double tokens, double capacity, double refillRate)
    {
        this.capacity=capacity;
        this.tokens=tokens;
        this.refillRate=refillRate;
    }
}
