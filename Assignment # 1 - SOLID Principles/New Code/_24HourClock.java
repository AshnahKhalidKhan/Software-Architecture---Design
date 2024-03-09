public class _24HourClock extends Clock implements DisplayIn24HourFormat
{
    private TimeDisplay timeDisplay;

    public _24HourClock()
    {
        super();
        timeDisplay = new TimeDisplay();
    }

    public String displayTime()
    {
        // return super.hours.displayTime() + " " + super.minutes.displayTime();
        return timeDisplay.showTwoTimeUnits(super.hours, super.minutes);
    }
    
    public String displayIn24HourFormat()
    {
        // return super.hours.getTime() + ":" + this.minutes.getTime();
        return timeDisplay.displayTwoTimeUnitsIn24HourFormat(super.hours, super.minutes);
    }
}