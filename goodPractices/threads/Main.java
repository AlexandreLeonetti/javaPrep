package goodPractices.threads;




public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that will increment the counter
        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print the final value of the counter
        System.out.println("Final count: " + counter.getCount());
    }
}


/*
 * Concurrency
Concurrency is about multiple threads executing simultaneously. In the provided example, two CounterThread instances are created and started, which means they run concurrently:

Creating Threads: Thread t1 = new CounterThread(counter); and Thread t2 = new CounterThread(counter);.
Starting Threads: t1.start(); and t2.start(); begin the execution of the threads concurrently.
Thread Safety
Thread safety ensures that shared resources are accessed by multiple threads in a way that prevents data corruption or inconsistency. In the example:

Shared Resource: The Counter instance is the shared resource.
Synchronized Methods: The increment and getCount methods are synchronized to ensure that only one thread can execute these methods at a time, preventing race conditions.
Combining Concurrency and Thread Safety
By combining concurrency (multiple threads running) and thread safety (synchronized access to shared resources), the program ensures that the counter is correctly incremented even when accessed by multiple threads simultaneously.
 */
