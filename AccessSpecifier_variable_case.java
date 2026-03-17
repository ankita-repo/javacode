package automationBatch62;

public class AccessSpecifier_variable_case 
{
	public static int a=100;
	protected int b= 50;
	int c=25;
	private int d=250;
	

	public static void main(String[] args) 
	{
		AccessSpecifier_variable_case as=new AccessSpecifier_variable_case();
	
		System.out.println(a);
		System.out.println(as.b);
		System.out.println(as.c);
		System.out.println(as.d);


	}

}
