public abstract class TimeUnit
{
    protected int thresholdTime;
    private int time;
    
    public void setTime(int time)
    {
        this.time = (time % this.thresholdTime);
    }
    
    public void changeTimeBy(int changeInTime)
    {
        setTime(this.time + changeInTime);
    }
    
    public void printTime()
    {
        System.out.println(this.time);
    }
    
    public void printThreshold()
    {
        System.out.println(this.thresholdTime);
    }
}