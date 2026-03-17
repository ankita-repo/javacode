package automationBatch62;

class Baseclass
{
	void Login()
	{
		System.out.println("Login Using Email id");
	}
}

public class Method_Overriding_LoginToAmazon extends Baseclass
{
	void Login()
	{
		super.Login();
		System.out.println("Login Using Mobile No");
	}

	public static void main(String[] args) 
	{
		Method_Overriding_LoginToAmazon L1= new Method_Overriding_LoginToAmazon();
		L1.Login();


	}

}
