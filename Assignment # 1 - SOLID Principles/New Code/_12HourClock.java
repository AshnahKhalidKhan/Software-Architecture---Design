public class _12HourClock extends Clock implements DisplayIn12HourFormat
{
    private TimeDisplay timeDisplay;

    public _12HourClock()
    {
        super();
        timeDisplay = new TimeDisplay();
    }

    public String displayTime()
    {
        // return super.hours.displayTime() + " " + super.minutes.displayTime();
        return timeDisplay.showTwoTimeUnits(super.hours, super.minutes);
    }
    
    public String displayIn12HourFormat()
    {
        // return (super.hours.getTime() % 12) + ":" + super.minutes.getTime() + " " + ((super.hours.getTime() % 12 == super.hours.getTime()) ? "AM" : "PM");
        return timeDisplay.displayTwoTimeUnitsIn12HourFormat(super.hours, super.minutes);
    }
}