// // public class Stopwatch implements TimeDevice, ShowsMinutes, ShowsSeconds, ShowsMilliseconds
// // {
// //     private Minutes minutes;
// //     private Seconds seconds;
// //     private Milliseconds milliseconds;
    
// //     public Stopwatch()
// //     {
// //         minutes = new Minutes();
// //         seconds = new Seconds();
// //         milliseconds = new Milliseconds();
// //     }
    
// //     public void setTime()
// //     {
// //         // u.setTime
// //     }
    
    
// //     public void setMinutes(int n)
// //     {
// //         minutes.setTime(n);
// //     }
// //     public Hours setMinutes(Minutes minutes)
// //     {
// //         return new Hours();
// //     }
    
// //     public void setSeconds(){}
// //     public Minutes setSeconds(Seconds seconds)
// //     {
// //         return new Minutes();
// //     }
    
// //     public void setMilliseconds(){}
// //     public Seconds setMilliseconds(Milliseconds milliseconds)
// //     {
// //         return new Seconds();
// //     }
    
// //     // public String displayTime()
// //     // {
// //     //     return this.minutes.displayTime() + this.seconds.displayTime() + this.milliseconds.displayTime();
// //     // }
// // }


// public class Stopwatch extends MinuteSecondsMillisecondsDevice
// {
    
// }


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
        this = new Stopwatch();
        seconds = seconds + this.milliseconds.changeInNextTimeUnit(milliseconds);
        minutes = minutes + this.seconds.changeInNextTimeUnit(seconds);
        setMilliseconds(milliseconds);
        setSeconds(seconds);
        setMinutes(minutes);
    }
    
    // ml, s, min
    // 5050, 70, 40
    // 50, 70 + 5, 40
    // 50, 15, 40 + 1
    // 50, 15, 41
    public void setMilliseconds(int milliseconds)
    {
        // changeSeconds(this.milliseconds.changeInNextTimeUnit(milliseconds));
        this.milliseconds.setTime(milliseconds);
    }
    
    public void changeMilliseconds(int changeInMilliseconds)
    {
        changeSeconds(this.milliseconds.changeInNextTimeUnit(changeInMilliseconds));
        this.milliseconds.changeTimeBy(changeInMilliseconds);
    }
    
    public void setSeconds(int seconds)
    {
        // changeMinutes(this.seconds.changeInNextTimeUnit(seconds));
        this.seconds.setTime(seconds);
    }
    
    public void changeSeconds(int changeInSeconds)
    {
        
    }
    
    public void setMinutes(int minutes)
    {
        this.minutes.setTime(minutes);
    }
    
    public void changeMinutes(int changeInMinutes)
    {
        
    }
    
    // public String displayTime()
    // {
    //     return this.minutes.displayTime() + this.seconds.displayTime() + this.milliseconds.displayTime();
    // }
}


// public class Stopwatch extends MinuteSecondsMillisecondsDevice
// {
    
// }