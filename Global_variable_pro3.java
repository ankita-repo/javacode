package automationBatch62;

public class Global_variable_pro3 
{
	static int a=10;//static global variable
	double b =20.3;//Non-static global variable which is called as instance global variable
	static int c=30;
	static int d;

	public static void main(String[] args) 
	{
		a=100;
		System.out.println(a);
		Global_variable_pro3  g1= new Global_variable_pro3 ();
		g1.b=600;
		System.out.println(g1.b);
		
		
		
        

	}

}
