public class _12HourClock extends Clock implements DisplayIn12HourFormat
{
    public _12HourClock()
    {
        super();
    }

    public String displayTime()
    {
        return displayIn12HourFormat();
    }
    
    public String displayIn12HourFormat()
    {
        return (super.hours.getTime() % 12) + ":" + this.minutes.getTime() + " " + ((super.hours.getTime() % 12 == super.hours.getTime()) ? "AM" : "PM");
    }
}