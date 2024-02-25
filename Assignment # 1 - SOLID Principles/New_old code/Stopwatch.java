public class Stopwatch implements TimeDevice
{
    Minutes minutes;
    Seconds seconds;
    Milliseconds milliseconds;
    
    public Stopwatch()
    {
        minutes = new Minutes();
        seconds = new Seconds();
        milliseconds = new Milliseconds();
    }
    
    public void setTime()
    {
        // u.setTime
    }
    
    // public String displayTime()
    // {
    //     return this.minutes.displayTime() + this.seconds.displayTime() + this.milliseconds.displayTime();
    // }
}
