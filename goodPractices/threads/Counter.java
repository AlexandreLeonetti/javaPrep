package goodPractices.threads;

public class Counter {
    private int count = 0;

    // Synchronized method to ensure thread-safe increment
    public synchronized void increment() {
        count++;
    }

    // Getter for count
    public synchronized int getCount() {
        return count;
    }
}
