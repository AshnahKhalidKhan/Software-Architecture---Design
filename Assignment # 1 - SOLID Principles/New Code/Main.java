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
		System.out.println(s.displayTime());
		s.setTime(41, 70, -50);
		System.out.println(s.displayTime());
		s.setTime(41, 70, 5000);
		System.out.println(s.displayTime());
		s.changeMilliseconds(-1);
		System.out.println(s.displayTime());
		s.changeMilliseconds(-1000);
		System.out.println(s.displayTime());
		s.changeMinutes(18);
		System.out.println(s.displayTime());
		s.changeSeconds(-16);
		System.out.println(s.displayTime());
        System.out.println("\n");
        //
        Stopwatch s1 = new Stopwatch();
		s1.setTime(3, 70, 5010);
		System.out.println(s1.displayTime());
		s1.changeMilliseconds(-11);
		System.out.println(s1.displayTime());
		s1.changeMilliseconds(-1000);
		System.out.println(s1.displayTime());
		System.out.println("\n");
        //
        Stopwatch s2 = new Stopwatch();
		s2.setTime(3, 70, 5010);
		System.out.println(s2.displayTime());
		s2.changeMilliseconds(11);
		System.out.println(s2.displayTime());
		s2.changeMilliseconds(1001);
		System.out.println(s2.displayTime());
		System.out.println("\n");
		//
		Stopwatch s3 = new Stopwatch();
		s3.setTime(3, 70, 5000);
		System.out.println(s3.displayTime());
		s3.changeMilliseconds(1001);
		System.out.println(s3.displayTime());
		s3.changeMilliseconds(1001);
		System.out.println(s3.displayTime());
		s3.changeSeconds(43);
		System.out.println(s3.displayTime());
		s3.changeMilliseconds(-3);
		System.out.println(s3.displayTime());
		s3.changeSeconds(-1);
		System.out.println(s3.displayTime());
		s3.changeSeconds(-68);
		System.out.println(s3.displayTime());
		s3.changeMinutes(1);
		System.out.println(s3.displayTime());
		s3.changeMinutes(-1);
		System.out.println(s3.displayTime());
		System.out.println(m.thresholdTime);
// 		s3.changeMinutes(60);
// 		System.out.println(s3.displayTime());
	}
}
