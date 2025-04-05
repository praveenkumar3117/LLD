package RateLimiter;

public class Main {

    public static void main(String [] args)
    {
        User user1 = new User("1",10);
        User user2 = new User("2", 20);
        RateLimiter rateLimitingStrategy = new LinkedListStrategy();
        /*for(int i=0;i<1000;i++)
        {
            System.out.println(requestHandler.allowRequest(user1));
        }*/

        rateLimitingStrategy = new TokenBucketStrategy();
        for(int i=0;i<1000;i++)
        {
            System.out.println(rateLimitingStrategy.allowRequest(user1));
        }




        RateLimiter rateLimitor = RateLimitorFactory.createRateLimitor("fixed");
        for(int i=0;i<1000;i++)
        {
            System.out.println(rateLimitor.allowRequest(user1));
        }

        rateLimitor = RateLimitorFactory.createRateLimitor("tokenbucket");
        for(int i=0;i<1000;i++)
        {
            System.out.println(rateLimitor.allowRequest(user2));
        }

    }
}
