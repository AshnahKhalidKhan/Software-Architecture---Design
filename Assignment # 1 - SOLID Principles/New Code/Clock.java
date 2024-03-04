public abstract class Clock implements TimeDevice, ShowsHours, ShowsMinutes
{
    protected Hours hours;
    protected Minutes minutes;

    public Clock()
    {
        this.hours = new Hours();
        this.minutes = new Minutes();
    }
    
    public abstract String displayTime();
    
    public void setTime(int hours, int minutes)
    {
        this.hours = new Hours();
        this.minutes = new Minutes();
        hours = hours + this.minutes.changeInNextTimeUnit(minutes);
        setMinutes(minutes);
        setHours(hours);
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
    
    // public String displayTime()
    // {
    //     return this.hours.displayTime() + " " + this.minutes.displayTime();
    // }
}