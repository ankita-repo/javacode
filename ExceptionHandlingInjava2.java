package automationBatch62;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingInjava2 
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner s1= new Scanner(System.in);
			System.out.println("Please enter the age of 1st student");
			int age1=s1.nextInt();	
		}
		catch(InputMismatchException im)
		{
			System.out.println("Handled the exception");
			Scanner s1= new Scanner(System.in);
			System.out.println("Please enter the age of 2nd student");
			int age1=s1.nextInt();	
		}
		
		
		System.out.println("Thank you entering your age");
		
		
		
		/*System.out.println("Please enter the age of 2nd student");
		
		int age2=s1.nextInt();
		System.out.println("Please enter the age of 3rd student");
		
		int age3=s1.nextInt();
				
		*/
		


	}

}
