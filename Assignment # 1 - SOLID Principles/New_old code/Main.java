public class Main
{
	public static void main(String[] args) 
	{
		Hours h = new Hours();
		h.setTime(0);
		h.printTime();
		h.changeTimeBy(48);
		h.printTime();
		h.printThreshold();
		//
		Minutes m = new Minutes();
		m.setTime(-56);
		m.printTime();
		m.changeTimeBy(56);
		m.printTime();
		m.printThreshold();
		//
		TimeDevice d = new Stopwatch();
// 		System.out.println(d.displayTime());
	}
}
