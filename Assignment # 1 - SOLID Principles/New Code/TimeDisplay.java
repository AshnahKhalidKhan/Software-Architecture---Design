public class TimeDisplay
{
    // public String showHoursMinutes(TimeDevice d);
    // public String showHoursMinutesSeconds(TimeDevice d);
    // public String showHoursMinutesSecondsMilluseconds(TimeDevice d);
    // public String showMinutesSeconds(TimeDevice d);
    // public String showMinutesSecondsMilliSeconds(TimeDevice d);

    public String displayTimeUnit(TimeUnit t)
    {
        return t.getClass().getName() + ": " + t.getTime();
    }

    public String showTwoTimeUnits(TimeUnit a, TimeUnit b)
    {
        return displayTimeUnit(a) + " " + displayTimeUnit(b);
    }

    public String showThreeTimeUnits(TimeUnit a, TimeUnit b, TimeUnit c)
    {
        return displayTimeUnit(a) + " " + displayTimeUnit(b) + " " + displayTimeUnit(c);
    }

    public String showFourTimeUnits(TimeUnit a, TimeUnit b, TimeUnit c, TimeUnit d)
    {
        return displayTimeUnit(a) + " " + displayTimeUnit(b) + " " + displayTimeUnit(c) + " " + displayTimeUnit(d);
    }

    public String displayTwoTimeUnitsIn24HourFormat(TimeUnit a, TimeUnit b)
    {
        return a.getTime() + ":" + b.getTime();
    }

    public String displayThreeTimeUnitsIn24HourFormat(TimeUnit a, TimeUnit b, TimeUnit c)
    {
        return a.getTime() + ":" + b.getTime() + ":" + c.getTime();
    }

    public String displayFourTimeUnitsIn24HourFormat(TimeUnit a, TimeUnit b, TimeUnit c, TimeUnit d)
    {
        return a.getTime() + ":" + b.getTime() + ":" + c.getTime() + ":" + d.getTime();
    }

    public String displayTwoTimeUnitsIn12HourFormat(Hours hours, Minutes minutes)
    {
        return (hours.getTime() % 12) + ":" + minutes.getTime() + " " + ((hours.getTime() % 12 == hours.getTime()) ? "AM" : "PM");
    }

    public String displayThreeTimeUnitsIn12HourFormat(Hours hours, Minutes minutes, Seconds seconds)
    {
        return (hours.getTime() % 12) + ":" + minutes.getTime() + ":" + seconds.getTime() + " " + ((hours.getTime() % 12 == hours.getTime()) ? "AM" : "PM");
    }

    public String displayFourTimeUnitsIn12HourFormat(Hours hours, Minutes minutes, Seconds seconds, Milliseconds milliseconds)
    {
        return (hours.getTime() % 12) + ":" + minutes.getTime() + ":" + seconds.getTime() + ":" + milliseconds.getTime() + " " + ((hours.getTime() % 12 == hours.getTime()) ? "AM" : "PM");
    }
}