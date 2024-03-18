public interface TimeDevice 
{
    TimeDisplay timeDisplay = new TimeDisplay();
    // public void setTime(TimeUnit t);
    public String displayTime();
}