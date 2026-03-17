package automationBatch62;

public class Operators_Program 
{
	public static void Add()
	{
		int A = 20;
	    int B= 200;
	    int C= A+B;
	    System.out.println(C);
	}
	public static void Sub()
	{
		int A= 200;
		int B=100;
		int C= A-B;
		System.out.println(C);
	}
	public static void mul()
	{
		int A = 20;
		int B = 20;
		int C= A*B;
		System.out.println(C);
				
	}
	public static void div()
	{
		int A= 200;
		int B= 20;
		int C=A%B;
		System.out.println(C);
		
	}
	public static void modu()
	{
		int A=10;
		int B= 2;
		int C= A/B;
		System.out.println(C);
	}
	
	public static void main(String[] args) 
	{
		Add();
		Sub();
		mul();
		div();
		modu();
		

	}

}
