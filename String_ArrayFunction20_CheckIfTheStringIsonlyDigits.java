package automationBatch62;

import java.util.Arrays;

public class String_ArrayFunction20_CheckIfTheStringIsonlyDigits 
{
	static int NoOfDigits=0;
	public static void main(String[] args) 
	{
		String Input="Ankita kumari 25101991";
		char[] C=Input.toCharArray();
		System.out.println(Arrays.toString(C));
		
		for(int i=0;i<C.length;i++)
		{
			boolean A=Character.isDigit(C[i]);
			if(A==true)
			{
				NoOfDigits++;
			}
			
		}
		System.out.println(NoOfDigits);
		if(NoOfDigits==C.length)
		{
			System.out.println("Given String has only Digits");
		}
		else
		{
			System.out.println("Given String has other values also");
		}
		
	}
	
	
	
		
		
		
		
			
}
	

	
	
		
		
		
		
		

	

	
	



