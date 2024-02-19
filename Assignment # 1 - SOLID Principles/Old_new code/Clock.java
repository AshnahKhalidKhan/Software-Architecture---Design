public class Clock
{
    private int hours;
    private int minutes;
    
    public Clock (int hours, int minutes)
    {
        if (Math.abs(minutes) > 59 && minutes < 0)
        {
            hours--;
        }
        while (Math.abs(minutes) > 59)
        {
            if (minutes < 0)
            {
                hours--;
                minutes = minutes + 60;
            }
            else //if minutes >= 0
            {
                hours++;
                minutes = minutes - 60;
            }
        }
        this.minutes = ((minutes + 60) % 60);
        this.hours = ((hours + 24) % 24);
    }
    
    public String toString() 
    {
        return this.hours + ":" + this.minutes + " hours: " + this.hours + " minutes: " + this.minutes;
    }
    
    public String 24HourFormat() 
    {
        return this.hours + ":" + this.minutes;
    }
    
    public String 12HourFormat() 
    {
        if (this.hours < 13)
        {
            return ((this.hours + 24) % 24)  + ":" + ((this.minutes + 60) % 60) + " AM";
        }
        else // if
        {
            return ((this.hours + 24) % 24)  + ":" + ((this.minutes + 60) % 60) + " PM";
        }
    }
}