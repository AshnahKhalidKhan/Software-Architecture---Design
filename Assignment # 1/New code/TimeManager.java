public class TimeManager implements Timer {
    private int hours;
    private int minutes;

    @Override
    public void start() {
        // Logic for starting the timer
    }

    @Override
    public void pause() {
        // Logic for pausing the timer
    }

    @Override
    public void stop() {
        // Logic for stopping the timer
    }

    // Dependency Inversion Principle: High-level module depends on abstraction (Timer)
    // and not on the details (TimeManager)
}
