package automationBatch62;

import java.util.Scanner;

public class switchCase_program {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("press 1 for Chrome browser");
		System.out.println("press 2 for Mozilla browser");
		System.out.println("press 3 for Edge browser");
		System.out.println("press 4 for Safari browser ");
		
		switch (s1.nextInt())
		{
		case 1: System.out.println("Launching Chrome Browser");
		break;
		
		case 2: System.out.println("Launching Mozilla browser");
		break;
		
		case 3: System.out.println("Launching Edge Browser");
		break;
		
		case 4: System.out.println("Launching Safari browser");
		break;
		
		default:
			System.out.println("Sorry you have selected wrong option");
		
		
		}
		s1.close();

	}

}
