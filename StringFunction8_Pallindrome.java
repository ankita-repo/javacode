package automationBatch62;

public class StringFunction8_Pallindrome {

	public static void main(String[] args) 
	{
		String a="Radar";
		String a1=a.toLowerCase();
		String reverse="";
		
		for(int i=a1.length()-1;i>=0;i--)
		{
		char c=	a1.charAt(i);
		reverse=reverse+c;
		}
		System.out.println(reverse);
		if (a1.equalsIgnoreCase(reverse))
		{
			System.out.println("Given String is pallindrome");
		}
		else 
		{
			System.out.println("Given String is not pallindrome");
		}


	}

}
