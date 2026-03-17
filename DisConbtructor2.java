package automationBatch62;

public class DisConbtructor2 extends DisConbtructor1 
{
	public DisConbtructor2()
	{
		super(20);
		System.out.println("I am third one");
	}
	public DisConbtructor2(int a)
	{	
		this();
		//super(20);
		System.out.println("I am fourth one");
	}
	
	public static void main(String[] args) 
	{
		DisConbtructor2 db= new DisConbtructor2(20);


	}

}
