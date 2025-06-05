This rate limiter have design for 2 types of limiter
1. LinkedList fixed window
2. TokenBucket

I have implemented strategy pattern also making two different strategies and a common interface



In linkedlist strategy, i am maintaining a list of the timestamps for the user, when a new request comes up, first of all
i will remove all the requests that are older than currentTime - 60 seconds. Then i will check if there are still requests
in the list more than ratelimit or not




