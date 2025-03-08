Here we make some strategies suppose A, B, C are the strategies to perform some algorithm.
We make a strategy interface that defines the functions which will be implemented by the Strategy classes.
Then we have a context class(Here is Vehicle), that assigns the task to a type of strategy. 

Let's look into example
Suppose we have some strategies to sort an array let's say A, B, C.
Then we have a strategy interface which will define function sort().
A, B, C will implement sort() in their own way of sorting.
Now, in the context, I declare a variable of type StrategyInterface and in constructor I am taking
obj of type StrategyInterface and assigning the variable to it.


//This is the Context that assigns the strategy to a task
public class SortingContext {
private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }
    
    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }
}



//This is strategy Interface
public interface SortingStrategy {
    void sort(int[] array);
}



//These are strategies
// BubbleSortStrategy
public class BubbleSortStrategy implements SortingStrategy {
@Override
public void sort(int[] array) {
// Implement Bubble Sort algorithm
System.out.println("Sorting using Bubble Sort");
}
}

// MergeSortStrategy
public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
    // Implement Merge Sort algorithm
    System.out.println("Sorting using Merge Sort");
    }
}

// QuickSortStrategy
public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
    // Implement Quick Sort algorithm
    System.out.println("Sorting using Quick Sort");
    }
}

public class Client {
public static void main(String[] args) {
        // Create SortingContext with BubbleSortStrategy
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        int[] array1 = {5, 2, 9, 1, 5};
        sortingContext.performSort(array1); // Output: Sorting using Bubble Sort

        // Change strategy to MergeSortStrategy
        sortingContext.setSortingStrategy(new MergeSortStrategy());
        int[] array2 = {8, 3, 7, 4, 2};
        sortingContext.performSort(array2); // Output: Sorting using Merge Sort

        // Change strategy to QuickSortStrategy
        sortingContext.setSortingStrategy(new QuickSortStrategy());
        int[] array3 = {6, 1, 3, 9, 5};
        sortingContext.performSort(array3); // Output: Sorting using Quick Sort
    }
}




When to use the Strategy Design Pattern?
Multiple Algorithms: When you have multiple algorithms that can be used interchangeably based on different contexts,
such as sorting algorithms (bubble sort, merge sort, quick sort), searching algorithms, compression algorithms, etc.

Encapsulating Algorithms: When you want to encapsulate the implementation details of algorithms separately from the context
that uses them, allowing for easier maintenance, testing, and modification of algorithms without affecting the client code.


Advantages:
Multiple Algorithms can be defined for different kind of behaviours without changing the architecture.

New Strategy can be added just by implementing the interface class functions without any other changes.


Disadvantage:
Strategy base class must expose interface for all the required behaviours, which some concrete Strategy classes might not implement.











In my example that i have implemented. So i have a base class Vehicle(Context).
I have other classes like NormalVehicle, OffRoadVehicle, SportsVehicle that extends Vehicle.
Suppose Vehicle have some function drive(), that is doing something, but it is not same for its child class.
But two of them share the same functionality, so if you don't make any strategy, then you have to write the same code
in two class that is the drive() function.
But if you have strategies then you can write the drive() function into it and while creating the object of
vehicle just pass the strategy you wanna use for this vehicle. Vehicle have a constructor that will assign
its variable to that strategy obj. And you can use the drive() function of that type.

In this case
NormalVehicle have it's own strategy i.e NormalDriveStrategy
SportsVehicle and OffRoadVehicle share the same type of drive function strategy i.e SportsDriveStrategy



