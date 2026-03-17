package automationBatch62;

class Baseclass1
{
	void Login()
	{
		System.out.println("Login Using Email id");
	}
}

public class Method_Overriding_LoginToAmazon2_Superkeyword extends Baseclass1
{
	void Login()
	{
		super.Login();
		System.out.println("Login Using Mobile No");
	}

	public static void main(String[] args) 
	{
		Method_Overriding_LoginToAmazon2_Superkeyword L1= new Method_Overriding_LoginToAmazon2_Superkeyword();
		L1.Login();


	}

}
