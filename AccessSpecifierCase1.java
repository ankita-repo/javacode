package automationBatch62;

public class AccessSpecifierCase1 
{
	public static void add()
	{
	   System.out.println("I am addition method");
	}
	protected static void sub()
	{
		System.out.println("I am Substraction method");	
	}
	static void mul()
	{
		System.out.println("I am multiplication method");
	}
	private static void div()
	{
		System.out.println("I am division method");
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
}
}
