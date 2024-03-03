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

		
		Stopwatch s = new Stopwatch();
		s.setTime(41, 70, 5000);
		System.out.println(s.displayTime());
		s.changeSeconds(-16);
// 		s.changeMinutes(60-42);
		System.out.println(s.displayTime());
	}
}
