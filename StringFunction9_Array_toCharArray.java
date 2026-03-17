package automationBatch62;

import java.util.Arrays;

public class StringFunction9_Array_toCharArray 
{

	public static void main(String[] args) 
	{
		String A= "AnKita";
	char [] A1=A.toCharArray();
	
	for (int i=0;i<=A1.length-1;i++)
	{
		System.out.println(A1[i]); 
	}
	System.out.println(Arrays.toString(A1));
	
	A= A.concat("programing");
	System.out.println(A);
		


	}

}
