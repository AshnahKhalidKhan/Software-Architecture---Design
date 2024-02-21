public class Main
{
	public static void main(String[] args) 
	{
		Hours h = new Hours();
		h.setTime(26);
		h.printTime();
		h.changeTimeBy(4);
		h.printTime();
		h.printThreshold();
		Minutes m = new Minutes();
		m.setTime(60);
		m.printTime();
		m.changeTimeBy(4);
		m.printTime();
		m.printThreshold();
	}
}
