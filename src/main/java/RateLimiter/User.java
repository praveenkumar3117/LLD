package RateLimiter;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class User {
    private String id;
    private int rateLimit;
    User(String id, int rateLimit)
    {
        this.id=id;
        this.rateLimit=rateLimit;
    }
}
