public class Main
{
	public static void main(String[] args) 
	{
        Clock c1 = new Clock(1, 20);
        // hours: 1, minutes: 20
        
        Clock c2 = new Clock(-1, 20);
        // hours: 23, minutes: 20
        
        Clock c3 = new Clock(1, -20);
        // hours: 1, minutes: 40
        
        Clock c4 = new Clock(-1, -20);
        // hours: 23, minutes: 40
        
        Clock c5 = new Clock(49, 20);
        // hours: 1, minutes: 20
        
        Clock c6 = new Clock(1, 70);
        // hours: 2, minutes: 10
        
        Clock c7 = new Clock(-1, 70);
        // hours: 0, minutes: 10
        
        Clock c8 = new Clock(49, -20);
        // hours: 1, minutes: 40
        
        Clock c9 = new Clock(1, -70);
        // hours: 23, minutes: 50
        
        Clock c10 = new Clock(1, -130);
        // hours: 22, minutes: 50
        
        Clock c11 = new Clock(49, -190);
        // hours: 21, minutes: 50
        
        System.out.println(c1.toString().equals("1:20 hours: 1 minutes: 20"));
        System.out.println(c1._24HourFormat().equals("1:20"));
        System.out.println(c1._12HourFormat().equals("1:20 AM"));
        System.out.println(c1 + "\n");
        
        System.out.println(c2.toString().equals("23:20 hours: 23 minutes: 20"));
        System.out.println(c2._24HourFormat().equals("23:20"));
        System.out.println(c2._12HourFormat().equals("11:20 PM"));
        System.out.println(c2 + "\n");
        
        System.out.println(c3.toString().equals("1:40 hours: 1 minutes: 40"));
        System.out.println(c3._24HourFormat().equals("1:40"));
        System.out.println(c3._12HourFormat().equals("1:40 AM"));
        System.out.println(c3 + "\n");
        
        System.out.println(c4.toString().equals("23:40 hours: 23 minutes: 40"));
        System.out.println(c4._24HourFormat().equals("23:40"));
        System.out.println(c4._12HourFormat().equals("11:40 PM"));
        System.out.println(c4 + "\n");
        
        System.out.println(c5.toString().equals("1:20 hours: 1 minutes: 20"));
        System.out.println(c5._24HourFormat().equals("1:20"));
        System.out.println(c5._12HourFormat().equals("1:20 AM"));
        System.out.println(c5 + "\n");
        
        System.out.println(c6.toString().equals("2:10 hours: 2 minutes: 10"));
        System.out.println(c6._24HourFormat().equals("2:10"));
        System.out.println(c6._12HourFormat().equals("2:10 AM"));
        System.out.println(c6 + "\n");
        
        System.out.println(c7.toString().equals("0:10 hours: 0 minutes: 10"));
        System.out.println(c7._24HourFormat().equals("0:10"));
        System.out.println(c7._12HourFormat().equals("0:10 AM"));
        System.out.println(c7 + "\n");
        
        System.out.println(c8.toString().equals("1:40 hours: 1 minutes: 40"));
        System.out.println(c8._24HourFormat().equals("1:40"));
        System.out.println(c8._12HourFormat().equals("1:40 AM"));
        System.out.println(c8 + "\n");
        
        System.out.println(c9.toString().equals("23:50 hours: 23 minutes: 50"));
        System.out.println(c9._24HourFormat().equals("23:50"));
        System.out.println(c9._12HourFormat().equals("11:50 PM"));
        System.out.println(c9 + "\n");
        
        System.out.println(c10.toString().equals("22:50 hours: 22 minutes: 50"));
        System.out.println(c10._24HourFormat().equals("22:50"));
        System.out.println(c10._12HourFormat().equals("10:50 PM"));
        System.out.println(c10 + "\n");
        
        System.out.println(c11.toString().equals("21:50 hours: 21 minutes: 50"));
        System.out.println(c11._24HourFormat().equals("21:50"));
        System.out.println(c11._12HourFormat().equals("9:50 PM"));
        System.out.println(c11 + "\n");
	}
}