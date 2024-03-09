public class Timer implements TimeDevice, ShowsHours, ShowsMinutes, ShowsSeconds
{
    private Hours hours;
    private Minutes minutes;
    private Seconds seconds;
    private TimeDisplay timeDisplay;
    
    public Timer()
    {
        this.hours = new Hours();
        this.minutes = new Minutes();
        this.seconds = new Seconds();
        timeDisplay = new TimeDisplay();
    }
    
    public void setTime(int hours, int minutes, int seconds)
    {
        this.hours = new Hours();
        this.minutes = new Minutes();
        this.seconds = new Seconds();
        minutes = minutes + this.seconds.changeInNextTimeUnit(seconds);
        hours = hours + this.minutes.changeInNextTimeUnit(minutes);
        setSeconds(seconds);
        setMinutes(minutes);
        setHours(hours);
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
        changeHoursBy(this.minutes.changeInNextTimeUnit(changeInMinutes));
        this.minutes.changeTimeBy(changeInMinutes);
    }
    
    public void setHours(int hours)
    {
        this.hours.setTime(hours);
    }
    
    public void changeHoursBy(int changeInHours)
    {
        this.hours.changeTimeBy(changeInHours);
    }
    
    public String displayTime()
    {
        // return this.hours.displayTime() + " " + this.minutes.displayTime() + " " + this.seconds.displayTime();
        return timeDisplay.showThreeTimeUnits(this.hours, this.minutes, this.seconds);
    }
}