public class Main
{
	public static void main(String[] args) 
	{
		Hours h = new Hours();
		h.setTime(0);
		// h.printTime();
		h.changeTimeBy(48);
		// h.printTime();
		// h.printThreshold();
		System.out.println("\n");
 		//
		Minutes m = new Minutes();
		m.setTime(-56);
		// m.printTime();
		m.changeTimeBy(56);
		// m.printTime();
		// m.printThreshold();
		System.out.println("\n");
 		//
		Stopwatch s = new Stopwatch();
		System.out.println(s.displayTime());
		s.setTime(41, 70, -50);
		System.out.println(s.displayTime());
		s.setTime(41, 70, 5000);
		System.out.println(s.displayTime());
		s.changeMillisecondsBy(-1);
		System.out.println(s.displayTime());
		s.changeMillisecondsBy(-1000);
		System.out.println(s.displayTime());
		s.changeMinutesBy(18);
		System.out.println(s.displayTime());
		s.changeSecondsBy(-16);
		System.out.println(s.displayTime());
        System.out.println("\n");
        //
        Stopwatch s1 = new Stopwatch();
		s1.setTime(3, 70, 5010);
		System.out.println(s1.displayTime());
		s1.changeMillisecondsBy(-11);
		System.out.println(s1.displayTime());
		s1.changeMillisecondsBy(-1000);
		System.out.println(s1.displayTime());
		System.out.println("\n");
        //
        Stopwatch s2 = new Stopwatch();
		s2.setTime(3, 70, 5010);
		System.out.println(s2.displayTime());
		s2.changeMillisecondsBy(11);
		System.out.println(s2.displayTime());
		s2.changeMillisecondsBy(1001);
		System.out.println(s2.displayTime());
		System.out.println("\n");
		//
		Stopwatch s3 = new Stopwatch();
		s3.setTime(3, 70, 5000);
		System.out.println(s3.displayTime());
		s3.changeMillisecondsBy(1001);
		System.out.println(s3.displayTime());
		s3.changeMillisecondsBy(1001);
		System.out.println(s3.displayTime());
		s3.changeSecondsBy(43);
		System.out.println(s3.displayTime());
		s3.changeMillisecondsBy(-3);
		System.out.println(s3.displayTime());
		s3.changeSecondsBy(-1);
		System.out.println(s3.displayTime());
		s3.changeSecondsBy(-68);
		System.out.println(s3.displayTime());
		s3.changeMinutesBy(1);
		System.out.println(s3.displayTime());
		s3.changeMinutesBy(-1);
		System.out.println(s3.displayTime());
		s3.changeMinutesBy(60);
		System.out.println(s3.displayTime());
		System.out.println("\n");
		//
		Timer t = new Timer();
		System.out.println(t.displayTime());
		t.changeHoursBy(-1);
		System.out.println(t.displayTime());
		t.setTime(-1, -1, -1);
		System.out.println(t.displayTime());
		t.changeSecondsBy(1);
		System.out.println(t.displayTime());
		t.changeMinutesBy(1);
		System.out.println(t.displayTime());
		t.changeSecondsBy(-1);
		System.out.println(t.displayTime());
		t.changeHoursBy(4);
		System.out.println(t.displayTime());
		System.out.println("\n");
        // 
        _24HourClock c24 = new _24HourClock();
        System.out.println(c24.displayTime());
        System.out.println(c24.displayIn24HourFormat());
        c24.setTime(2, 3);
        System.out.println(c24.displayTime());
        System.out.println(c24.displayIn24HourFormat());
        c24.setTime(22, 3);
        System.out.println(c24.displayTime());
        System.out.println(c24.displayIn24HourFormat());
        System.out.println("\n");
        // 
        _12HourClock c12 = new _12HourClock();
        System.out.println(c12.displayTime());
        System.out.println(c12.displayIn12HourFormat());
        c12.setTime(2, 3);
        System.out.println(c12.displayTime());
        System.out.println(c12.displayIn12HourFormat());
        c12.setTime(22, 3);
        System.out.println(c12.displayTime());
        System.out.println(c12.displayIn12HourFormat());
        System.out.println("\n");
		//
		DigitalClock cd24 = new DigitalClock();
        System.out.println(cd24.displayTime());
        System.out.println(cd24.displayIn24HourFormat());
        cd24.setTime(2, 3, 1, 2);
        System.out.println(cd24.displayTime());
        System.out.println(cd24.displayIn24HourFormat());
        cd24.setTime(22, 3, 80, 9);
        System.out.println(cd24.displayTime());
        System.out.println(cd24.displayIn24HourFormat());
        System.out.println("\n");
	}
}