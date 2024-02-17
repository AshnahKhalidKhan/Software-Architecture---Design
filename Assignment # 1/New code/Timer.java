public interface Timer {
    // Interface Segregation Principle: Segregated into specific interfaces
    void start();

    void pause();

    void stop();
}
