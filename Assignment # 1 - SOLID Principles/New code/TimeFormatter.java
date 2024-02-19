public class TimeFormatter {
    // Single-responsibility Principle: Handles time formatting only
    public static String format(int hours, int minutes) {
        return String.format("%02d:%02d", hours, minutes);
    }
}

