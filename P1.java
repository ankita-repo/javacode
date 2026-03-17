package automationBatch62;
class P3
{
	P3()
	{
		System.out.println("Constructor 3"); 
		
	}
	
	}

class P2 extends P3
{
	P2(int a)
	{
		System.out.println("Constructor Parent");
	}
}

public class P1 extends P2
{
	P1()
	{
		super(100);
		System.out.println("Constructor Child");
	}

	public static void main(String[] args) 
	{
		P1 p= new P1();
		

	}

}
