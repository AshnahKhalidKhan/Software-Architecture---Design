public class Clock
{
    private int hours;
    private int minutes;
    
    /*
        TEST CASES: --> Check karlena Ashhhhh
        Clock(1, 20)
        hours: 1, minutes: 20
        
        Clock(-1, 20)
        hours: 23, minutes: 20
        
        Clock(1, -20)
        hours: 1, minutes: 40
        
        Clock(-1, -20)
        hours: 23, minutes: 40
        
        Clock(49, 20)
        hours: 1, minutes: 20
        
        Clock(1, 70)
        hours: 2, minutes: 10
        
        Clock(-1, 70) ------------------------> Confirm karao
        hours: 0, minutes: 10
        
        Clock(49, -20) ------------------------> Confirm karao
        hours: 1, minutes: 40
        
        Clock(1, -70) ------------------------> Ye to ghalat he lag raha hai...
        1:00
        1:-70
        23:50
        hours: 23, minutes: 50
    */
    
    public Clock (int hours, int minutes)
    {
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
        this.minutes = minutes % 60;
    }
    
    public String toString() 
    {
        return this.hours + ":" + this.minutes + " hours: " + this.hours + " minutes: " + this.minutes;
    }
}