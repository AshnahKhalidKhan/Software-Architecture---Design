// 3. Liskov Substitution Principle (LSP) Violation:
// Comment: If we replace Time with a subtype like PreciseTime that has more details, it may break the Clock class.

// File: Clock.java
public class Clock {
    public void displayTime(Time time) {
        // Code for displaying time on a digital clock
    }
}
