package automationBatch62;

public class Local_variable 
{
	public static void add()
	{
		int a= 20;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	void sub()
	{
		int a=50;
		int b=500;
		int c=b-a;
		System.out.println(c);
				
	}
	
	public static void main(String[] args) 
	{
		add();
		Local_variable  l= new Local_variable ();
		l.sub();
		
		


	}

}
