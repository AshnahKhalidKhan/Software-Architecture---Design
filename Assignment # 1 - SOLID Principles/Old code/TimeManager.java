// 5. Dependency Inversion Principle (DIP) Violation:
// Comment: TimeManager directly depends on TimeCalculator, violating DIP by depending on a concrete class.


// File: TimeManager.java
public class TimeManager {
    private TimeCalculator timeCalculator;

    public TimeManager() {
        this.timeCalculator = new TimeCalculator();
    }

    public int addSeconds(int seconds, Time time) {
        return timeCalculator.addSeconds(seconds, time);
    }
}
