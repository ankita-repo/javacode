package automationBatch62;
class K2
{
	K2()
	{
		System.out.println("Cons 4");
	}
	K2(int a)
	{
		this();
		System.out.println("Cons 3");
	}
}
public class K1_this_super extends K2
{
	K1_this_super()
	{
		super(55);
		System.out.println("Cons 2");
	}
	K1_this_super(int b)
	{
		this();
		System.out.println("Cons 1");
	}

	public static void main(String[] args) 
	{
		new K1_this_super(55);


	}

}
