public class _24HourClock extends Clock implements DisplayIn24HourFormat
{
    public _24HourClock()
    {
        super();
    }

    public String displayTime()
    {
        return displayIn24HourFormat();
    }
    
    public String displayIn24HourFormat()
    {
        return super.hours.getTime() + ":" + this.minutes.getTime();
    }
}