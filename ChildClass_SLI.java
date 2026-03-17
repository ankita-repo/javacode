package automationBatch62;
class ParentClass
{
	static void launchBrowser()
	{
		System.out.println("Launching Chrome Browser");
	}
	
}

public class ChildClass_SLI extends ParentClass
{
	static void addTocart()
	{
		System.out.println("Add product to cart");
	}

	public static void main(String[] args) 
	{
		launchBrowser();
		addTocart();
	}

}
