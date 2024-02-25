public interface TimeDisplay
{
    public String showHoursMinutes(TimeDevice d);
    public String showHoursMinutesSeconds(TimeDevice d);
    public String showHoursMinutesSecondsMilluseconds(TimeDevice d);
    public String showMinutesSeconds(TimeDevice d);
    public String showMinutesSecondsMilliSeconds(TimeDevice d);
}