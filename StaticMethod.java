package automationBatch62;

public class StaticMethod 
{
	public static void add()
	{
		System.out.println("I am a Add method");
	}
	static void Sub()
	{
		System.out.println("I am a substration");
		add();
		
	}
	void div()
	{
		System.out.println("I am Div method");
	}

	public static void main(String[] args) 
	{
		System.out.println("Automation Testing");
		System.out.println("Manual Testing");
        //add();
		Sub();
		StaticMethod s1= new StaticMethod();
		s1.div();
        
        

	}

}
