package automationBatch62;

public class Method_overloading62 
{
	public static void add(int a)
	{
		System.out.println("I am method overloading method 1");
	}
	public static void add(int a,int b)
	{
		System.out.println("I am method overloading method 2");
	}
	public static void add(double a, int b)
	{
		System.out.println("I am method overloading method 3");
	}
	public static void add(String a, int b)
	{
		System.out.println("I am method overloading method 4");
	}
	public static void add(boolean a, boolean b)
	{
		System.out.println("I am method overloading method 5");
	}

	public static void main(String[] args) 
	{
		
		add(true,false);
		add("Ankita",30);
		add(25.5,50);
		add(40,50);
		add(40);
		


	}

}
