package automationBatch62;

import java.util.Scanner;

public class For_loop4 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			Scanner s1= new Scanner(System.in);
			System.out.println("what is your name?");
			String name =s1.next();
			System.out.println(name);
			System.out.println("what is the radius of circle?");
			int radius=s1.nextInt();
			System.out.println(radius);
			
			
			double AreaOfcircle= Math.PI*radius*radius;
			System.out.println("what is your Arear?");
			System.out.println(AreaOfcircle);
		}


	}

}
