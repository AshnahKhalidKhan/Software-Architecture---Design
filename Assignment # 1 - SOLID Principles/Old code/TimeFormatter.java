// 2. Open-closed Principle (OCP) Violation:
// Comment: The TimeFormatter class is not closed for modification, as adding a new format requires modifying existing code.



// File: TimeFormatter.java
public class TimeFormatter {
    public String formatTime(Time time, String formatType) {
        // Code for formatting time based on formatType
        if (formatType.equals("24hr")) {
            return time.get24HourFormat();
        } else {
            return time.get12HourFormat();
        }
    }
}
