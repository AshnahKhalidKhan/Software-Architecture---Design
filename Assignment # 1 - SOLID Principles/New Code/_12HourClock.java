public class _12HourClock extends Clock implements DisplayIn12HourFormat
{
    public _12HourClock()
    {
        super();
    }

    public String displayTime()
    {
        return super.hours.displayTime() + " " + super.minutes.displayTime();
    }
    
    public String displayIn12HourFormat()
    {
        return (super.hours.getTime() % 12) + ":" + super.minutes.getTime() + " " + ((super.hours.getTime() % 12 == super.hours.getTime()) ? "AM" : "PM");
    }
}