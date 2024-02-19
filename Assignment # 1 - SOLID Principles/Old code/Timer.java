// 4. Interface Segregation Principle (ISP) Violation:
// Comment: The Timer interface has an unnecessary method displayTime, violating ISP.

// File: Timer.java
public interface Timer {
    void start();
    void stop();
    void reset();
    void displayTime();  // Violation for an unnecessary method in Timer interface
}
