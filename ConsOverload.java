package automationBatch62;

public class ConsOverload 
{
	ConsOverload(String a,boolean b )
	{
		System.out.println("1");
	}
	ConsOverload()
	{
		this("Ankita", true);
		System.out.println("2");
	}
	
	public static void main(String[] args) 
	{
		new ConsOverload();

	}

}
