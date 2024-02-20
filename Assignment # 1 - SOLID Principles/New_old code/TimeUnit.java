public abstract class TimeUnit
{
    protected int thresholdValue;
    private int value;
    
    public void setTime(int value)
    {
        this.value = (value % this.thresholdValue);
    }
    
    public void changeTimeBy(int changeInValue)
    {
        setTime(this.value + changeInValue);
    }
}