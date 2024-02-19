public class Main
{
	public static void main(String[] args) 
	{
        Clock c1 = new Clock(1, 20);
        System.out.println(c1.toString().equals("1:20 hours: 1 minutes: 20"));
        System.out.println(c1 + "\n");
        
        Clock c2 = new Clock(-1, 20); 
        System.out.println(c2.toString().equals("23:20 hours: 23 minutes: 20"));
        System.out.println(c2 + "\n");
        
        Clock c3 = new Clock(1, -20);
        System.out.println(c3.toString().equals("1:40 hours: 1 minutes: 40"));
        System.out.println(c3 + "\n");
        
        Clock c4 = new Clock(-1, -20);
        System.out.println(c4.toString().equals("23:40 hours: 23 minutes: 40"));
        System.out.println(c4 + "\n");
        
        Clock c5 = new Clock(49, 20);
        System.out.println(c5.toString().equals("1:20 hours: 1 minutes: 20"));
        System.out.println(c5 + "\n");
        
        Clock c6 = new Clock(1, 70);
        System.out.println(c6.toString().equals("2:10 hours: 2 minutes: 10"));
        System.out.println(c6 + "\n");
        
        Clock c7 = new Clock(-1, 70);
        System.out.println(c7.toString().equals("0:10 hours: 0 minutes: 10"));
        System.out.println(c7 + "\n");
        
        Clock c8 = new Clock(49, -20);
        System.out.println(c8.toString().equals("1:40 hours: 1 minutes: 40"));
        System.out.println(c8 + "\n");
        
        Clock c9 = new Clock(1, -70);
        System.out.println(c9.toString().equals("23:50 hours: 23 minutes: 50"));
        System.out.println(c9 + "\n");
        
        Clock c10 = new Clock(1, -130);
        System.out.println(c10.toString().equals("22:50 hours: 22 minutes: 50"));
        System.out.println(c10 + "\n");
        
        Clock c11 = new Clock(49, -190);
        System.out.println(c11.toString().equals("21:50 hours: 21 minutes: 50"));
        System.out.println(c11 + "\n");
	}
}