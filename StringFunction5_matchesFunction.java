package automationBatch62;

public class StringFunction5_matchesFunction {

	public static void main(String[] args) 
	{
		String a="google";
		
		// Check if the String start with g
		boolean a1=a.matches("g(.*)");
		System.out.println(a1);
		
		//check if the string ends with e
		a.matches("(.*)e");
		
		
		//Check if the string url has protocol
		String b="https://www.google.com";
		boolean b1=b.matches("https(.*)");
		boolean b2=b.matches("(.*)https");
		System.out.println(b1);
		System.out.println(b2);
		
		//please check we on the cart page of amazon
		String c="https//www.amazon.in/cart/smart-wagon";
		boolean c1=c.matches("(.*)cart(.*)");
		System.out.println(c1);
	
		

	}

}
