package Old_new code;

public class Clock
{
    private int hours;
    private int minutes;
    
    public Clock (int hours, int minutes)
    {
        if (hours < 0 || hours >= HOURS_IN_DAY) 
        {
            throw new IllegalArgumentException("Hours must be between 0 and " + (23));
        }
        this.hours = hours;
        this.hours = hours;
        this.minutes = minutes;
    }
}