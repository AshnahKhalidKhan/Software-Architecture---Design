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
        while (changeInTime < 0)
        {
            changeInTime = changeInTime + this.thresholdTime;
        }
        setTime(this.time + changeInTime);
    }
    
    public int changeInNextTimeUnit(int changeInTime)
    {
        //Agar negative number ho aur peechay he jaatay ja rahay ho to negative output do na...
        /*
            Check up 🙃
            if (changeInTime < 0)
            {
                return - ((this.time + changeInTime) / this.thresholdTime)
            }
        */
        if (this.time + changeInTime < 0)
        {
            int unitTime = 0;
            while (this.time + changeInTime < 0)
            {
                unitTime--;
                changeInTime = changeInTime + this.thresholdTime;
            }
            return unitTime;
        }
        return (this.time + changeInTime) / this.thresholdTime;
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