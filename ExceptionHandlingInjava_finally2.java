package automationBatch62;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingInjava_finally2

{

	public static void main(String[] args) 
	{
		try
		{
			Scanner s1= new Scanner(System.in);
			System.out.println("Please enter the age of 1st student");
			int age1= s1.nextInt();
			
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Exception Handled ");
		}
		finally
		{
			System.out.println("Closing the connection with database");
		}
		

	}

}
