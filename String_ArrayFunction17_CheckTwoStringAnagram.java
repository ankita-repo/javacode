package automationBatch62;
import java.util.Arrays;

public class String_ArrayFunction17_CheckTwoStringAnagram 
{
	public static void main(String[] args) 
	{
		String first="rail safety";
		String second="fairy tales";
	
		if(first.length()!=second.length())
		{
			System.out.println("Given String are not Anagram");
		}
		else
		{
			char[] c1= first.toCharArray();
			char[] c2=second.toCharArray();
		  
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Both the Strings are Anagram");
			}
			else
			{
				System.out.println("Both the Strings are not Anagram ");
			}
		}
		
			
		}
	

	
	
		
		
		
		
		
	}
	

	
	


//Check Two Strings are anagram
//first check the length of string
//Then shot the string to tocharArray
//Then check both array are equal
