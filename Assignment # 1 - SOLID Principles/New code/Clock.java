public class Clock {
    // Open-closed Principle: Open for extension, closed for modification
    private TimeFormatter timeFormatter;

    public Clock(TimeFormatter timeFormatter) {
        this.timeFormatter = timeFormatter;
    }

    public String displayTime(int hours, int minutes) {
        // Using the TimeFormatter for formatting
        return timeFormatter.format(hours, minutes);
    }
}
