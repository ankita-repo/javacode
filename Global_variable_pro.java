package automationBatch62;

public class Global_variable_pro 
{
	static int a=10;//static global variable
	double b =20.3;//Non-static global variable which is called as instance global variable
	static int c=30;
	static int d;
	static void add()
	{
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		
	}
	

	public static void main(String[] args) 
	{
		System.out.println(a+c);
        add();
        

	}

}
