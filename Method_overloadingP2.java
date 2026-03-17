package automationBatch62;

public class Method_overloadingP2 
{
    public static void add()
    {
    	int c=10;
    	System.out.println(c);
	}
    public static void add(int a, int b)
    {
    	int c=6+a+b;
    	System.out.println(c);
	}
    public static void add(int a, int b, double d)
    {
    	int c= a+b;
    	System.out.println(c);
	}
    public static void add(double a, double b)
    {
    	double c= 6+a+b;
    	System.out.println(c);
	}
    public static void add(double A, int B, char f)
    {
    	double c =6+ A+ B;
    	System.out.println(c);
	}
    public static void add(int a, int b, char f)
    {
    	int c= 6+a+b;
    	System.out.println(c);
	}
	public static void main(String[] args) 
	{
		add(20,30,'A');
		add(20.2,20,'B');
		add(20.2,20.4);
		add(50,60,60.6);
		add(40,50);
		add();
		
		
		
		
		

	}

}
