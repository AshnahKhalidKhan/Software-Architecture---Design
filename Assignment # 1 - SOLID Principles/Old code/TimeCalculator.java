// 1. Single-responsibility Principle (SRP) Violation:
// Comment: The TimeCalculator class has both addition and subtraction of seconds logic, violating SRP.


// File: TimeCalculator.java
public class TimeCalculator {
    public int addSeconds(int seconds, Time time) {
        // Code for adding seconds to the time
        return time.getSeconds() + seconds;
    }

    public int subtractSeconds(int seconds, Time time) {
        // Code for subtracting seconds from the time
        return time.getSeconds() - seconds;
    }
}
