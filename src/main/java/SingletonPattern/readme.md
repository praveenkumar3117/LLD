The singleton design pattern is a creational pattern that ensures a class has only one instance and provides a global point of access to it,
useful for managing shared resources like database connections or loggers

Single Instance – Only one object of the class is created.
Global Access Point – The instance can be accessed globally.
Thread Safety (optional) – Ensures only one instance is created even in multithreaded environments.


Logger is naive approach to make a Singleton, but it is not memory efficient bcz
it might be possible that logger object was never used. Bcz it was created while class loading
This is thread safe


LazyImplementation provided memory efficiency bcz we only created the logger when getInstance is called and it was not called before.
But it is not thread safe, if multiple threads call getInstance function then there might be multiple instances


