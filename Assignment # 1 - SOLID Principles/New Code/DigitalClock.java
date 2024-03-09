public class DigitalClock extends Clock implements ShowsSeconds, ShowsMilliseconds, DisplayIn24HourFormat
{
    private Seconds seconds;
    private Milliseconds milliseconds;
    private TimeDisplay timeDisplay;
    
    public DigitalClock()
    {
        super();
        seconds = new Seconds();
        milliseconds = new Milliseconds();
        timeDisplay = new TimeDisplay();
    }

    public void setTime(int hours, int minutes, int seconds, int milliseconds)
    {
        super.hours = new Hours();
        super.minutes = new Minutes();
        this.seconds = new Seconds();
        this.milliseconds = new Milliseconds();
        seconds = seconds + this.milliseconds.changeInNextTimeUnit(milliseconds);
        minutes = minutes + this.seconds.changeInNextTimeUnit(seconds);
        hours = hours + this.minutes.changeInNextTimeUnit(minutes);
        setMilliseconds(milliseconds);
        setSeconds(seconds);
        setMinutes(minutes);
        setHours(hours);
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
    
    public String displayTime()
    {
        // return super.hours.displayTime() + " " + super.minutes.displayTime() + " " + this.seconds.displayTime() + " " + this.milliseconds.displayTime();
        return timeDisplay.showFourTimeUnits(super.hours, super.minutes, this.seconds, this.milliseconds);
    }
    
    public String displayIn24HourFormat()
    {
        // return super.hours.getTime() + ":" + super.minutes.getTime() + ":" + this.seconds.getTime() + ":" + this.milliseconds.getTime();
        return timeDisplay.displayFourTimeUnitsIn24HourFormat(super.hours, super.minutes, this.seconds, this.milliseconds);
    }
}