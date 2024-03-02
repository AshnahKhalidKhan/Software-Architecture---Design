public class MinuteSecondsMillisecondsDevice extends TimeDevice implements ShowsMinutes, ShowsSeconds, ShowsMilliseconds
{
    private Minutes minutes;
    private Seconds seconds;
    private Milliseconds milliseconds;
    
    public MinuteSecondsMillisecondsDevice()
    {
        minutes = new Minutes();
        seconds = new Seconds();
        milliseconds = new Milliseconds();
    }
    
    public void setTime()
    {
        // u.setTime
    }
    
    
    public void setMinutes(int n)
    {
        minutes.setTime(n);
    }
    public Hours setMinutes(Minutes minutes)
    {
        return new Hours();
    }
    
    public void setSeconds(){}
    public Minutes setSeconds(Seconds seconds)
    {
        return new Minutes();
    }
    
    public void setMilliseconds(){}
    public Seconds setMilliseconds(Milliseconds milliseconds)
    {
        return new Seconds();
    }
    
    // public String displayTime()
    // {
    //     return this.minutes.displayTime() + this.seconds.displayTime() + this.milliseconds.displayTime();
    // }
}
