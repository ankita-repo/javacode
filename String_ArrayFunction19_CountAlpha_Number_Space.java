package automationBatch62;

import java.util.Arrays;

public class String_ArrayFunction19_CountAlpha_Number_Space 
{
	static int NoOfAlphabates=0;
	static int NoOfNumeric=0;
	static int NoOfSpace=0;
	
	public static void main(String[] args) 
	{
		String InputString="N S D A V Public School 843302";
		char[]InputString1=  InputString.toCharArray();
		System.out.println(Arrays.toString(InputString1));
		
		for(int i=0;i<InputString1.length;i++ )
		{
			boolean A= Character.isAlphabetic(InputString1[i]);
			if(A==true)
			{
				NoOfAlphabates++;
			}
			boolean B=Character.isDigit(InputString1[i]);
			if(B==true)
			{
				NoOfNumeric++;
			}
			boolean C= Character.isWhitespace(InputString1[i]);
			if(C==true)
			{
				NoOfSpace++;
			}
			
		}
		
		System.out.println(NoOfAlphabates);
		System.out.println(NoOfNumeric);
		System.out.println(NoOfSpace);
		
		
		
		
		
			
	}
	

	
	
		
		
		
		
		
	}
	

	
	



