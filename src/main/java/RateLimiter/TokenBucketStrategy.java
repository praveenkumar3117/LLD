package RateLimiter;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class TokenBucketStrategy implements RateLimiter {
    Map<String, TokenBucket> tokenBucketMap= new HashMap<>();

    @Override
    public boolean allowRequest(User user)
    {
        String userId= user.getId();
        if(!tokenBucketMap.containsKey(userId))
        {
            tokenBucketMap.put(userId, new TokenBucket((double) user.getRateLimit(), (double) user.getRateLimit(),1));
        }
        else
        {
            long currentTimeStamp=System.currentTimeMillis();
            System.out.println("Current timestamp "+currentTimeStamp);
            double timePassedLastRefill= (double)currentTimeStamp - tokenBucketMap.get(userId).getLastRefillTimeStamp();
            double tokensToBeAdded = timePassedLastRefill* tokenBucketMap.get(userId).getRefillRate();
            tokenBucketMap.get(userId).setTokens(min(tokensToBeAdded + tokenBucketMap.get(userId).getTokens(),tokenBucketMap.get(userId).getCapacity()));
            tokenBucketMap.get(userId).setLastRefillTimeStamp(currentTimeStamp);
            System.out.println("This is current tokens available "+  tokenBucketMap.get(userId).getTokens());
            System.out.println("Tokens added this time is "+tokensToBeAdded);
            if(tokenBucketMap.get(userId).getTokens()< (double)1)
            {
                System.out.println("Requests exceeded the rate limit");
                return false;
            }
        }
        tokenBucketMap.get(userId).setTokens(max(0,tokenBucketMap.get(userId).getTokens()-1));
        return true;
    }
}
