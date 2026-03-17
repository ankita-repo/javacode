package automationBatch62;

import java.util.Scanner;

public class AreaOfCircle_ByScInput {

	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
		{
		Scanner s1= new Scanner(System.in);
		System.out.println("what is your Name?");
	String NameOfStudent=s1.next();
	System.out.println("What is radius of circle?");
	double radius=s1.nextDouble();
	double AreaOfCricle= Math.PI*radius*radius;
	System.out.println(NameOfStudent);
	System.out.println(AreaOfCricle);
		}

		
		


	}

}
