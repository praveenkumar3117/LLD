package RateLimiter;

import java.util.*;

public class LinkedListStrategy implements RateLimiter {
    private Map<String, Queue<Long>> userTimeStamps = new HashMap<>();


    @Override
    public boolean allowRequest(User user) {
        long currentTimeStamp = System.currentTimeMillis();
        System.out.println("This is current timestamp " + currentTimeStamp);
        String userId = user.getId();
        int rateLimit = user.getRateLimit();

        if (!userTimeStamps.containsKey(userId)) {
            userTimeStamps.put(userId, new LinkedList<>());
            userTimeStamps.get(userId).add(currentTimeStamp);
        } else {
            if (userTimeStamps.get(userId).size() < rateLimit) {
                userTimeStamps.get(userId).add(currentTimeStamp);
            } else {
                while (!userTimeStamps.get(userId).isEmpty() && currentTimeStamp - userTimeStamps.get(userId).peek() > 60 * 1000L) {
                    userTimeStamps.get(userId).remove();
                }

                if (userTimeStamps.get(userId).size() >= rateLimit) {
                    System.out.println("Rate limit exceeded");
                    return false;
                } else {
                    userTimeStamps.get(userId).add(currentTimeStamp);
                }
            }
        }
        System.out.println("User " + userId + " has total requests " + userTimeStamps.get(userId).size());
        return true;
    }
}
