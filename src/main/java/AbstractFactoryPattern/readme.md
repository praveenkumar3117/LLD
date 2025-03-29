The Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
It’s useful when you need to create multiple objects that should be used together.

Encapsulation: Hides object creation logic from the client.
Loose Coupling: Client depends on abstract interfaces, not concrete implementations.
Consistency: Ensures that related objects are created together (e.g., UI components for Windows vs. Mac).