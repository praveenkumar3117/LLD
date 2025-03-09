The Observer Pattern is a design pattern used when you want multiple objects (observers) 
to be notified whenever a particular object (subject) changes.

How It Works in Code:
1. Subject (Observable): Maintains a list of observers and notifies them when something changes.
2. Observers: Objects that are interested in the changes and take action when notified

When to Use Observer Pattern?
When you need to notify multiple objects about changes in another object.

Here I have implemented a youtube notification feature that will notify the users
when a new video is uploaded through phone or emailId.