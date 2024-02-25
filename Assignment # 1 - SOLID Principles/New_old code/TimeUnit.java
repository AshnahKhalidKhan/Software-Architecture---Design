public abstract class TimeUnit
{
    protected int thresholdTime;
    private int time;
    
    public void setTime(int time)
    {
        this.time = ((time + this.thresholdTime) % this.thresholdTime);
    }
    
    public void changeTimeBy(int changeInTime)
    {
        setTime(this.time + changeInTime);
    }
    
    public String displayTime()
    {
        return this.getClass().getName() + ": " + this.time;
    }
    
    public void printTime()
    {
        System.out.println(this.getClass().getName() + ": " + this.time);
    }
    
    public void printThreshold()
    {
        System.out.println(this.thresholdTime);
    }
}