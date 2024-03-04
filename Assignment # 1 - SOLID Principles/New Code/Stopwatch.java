public class Stopwatch implements TimeDevice, ShowsMinutes, ShowsSeconds, ShowsMilliseconds
{
    private Minutes minutes;
    private Seconds seconds;
    private Milliseconds milliseconds;
    
    public Stopwatch()
    {
        minutes = new Minutes();
        seconds = new Seconds();
        milliseconds = new Milliseconds();
    }
    
    public void setTime(int minutes, int seconds, int milliseconds)
    {
        this.minutes = new Minutes();
        this.seconds = new Seconds();
        this.milliseconds = new Milliseconds();
        seconds = seconds + this.milliseconds.changeInNextTimeUnit(milliseconds);
        minutes = minutes + this.seconds.changeInNextTimeUnit(seconds);
        setMilliseconds(milliseconds);
        setSeconds(seconds);
        setMinutes(minutes);
    }
    
    public void setMilliseconds(int milliseconds)
    {
        this.milliseconds.setTime(milliseconds);
    }
    
    public void changeMillisecondsBy(int changeInMilliseconds)
    {
        changeSecondsBy(this.milliseconds.changeInNextTimeUnit(changeInMilliseconds));
        this.milliseconds.changeTimeBy(changeInMilliseconds);
    }
    
    public void setSeconds(int seconds)
    {
        this.seconds.setTime(seconds);
    }
    
    public void changeSecondsBy(int changeInSeconds)
    {
        changeMinutesBy(this.seconds.changeInNextTimeUnit(changeInSeconds));
        this.seconds.changeTimeBy(changeInSeconds);
    }
    
    public void setMinutes(int minutes)
    {
        this.minutes.setTime(minutes);
    }
    
    public void changeMinutesBy(int changeInMinutes)
    {
        // this.seconds.changeTimeBy(this.seconds.changeInNextTimeUnit(changeInMinutes));
        this.minutes.changeTimeBy(changeInMinutes);
    }
    
    public String displayTime()
    {
        return this.minutes.displayTime() + " " + this.seconds.displayTime() + " " + this.milliseconds.displayTime();
    }
}