package automationBatch62;

import java.util.Scanner;

public class Program_Scanner {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
	    int radius = s1.nextInt();
	    double  Areaofcircle = Math.PI*radius*radius;
		System.out.println(Areaofcircle);
		
	    int length=	s1.nextInt();
	    int breath=	s1.nextInt();
		int AreaOfRectangle= length*breath;
		System.out.println(AreaOfRectangle);
		
		int height =s1.nextInt();
		double AreaOfTringle = 0.5*breath*height;
		System.out.println(AreaOfTringle);
		
		int a=s1.nextInt();
		int AreaOfSquare= a*a;
		System.out.println(AreaOfSquare);
		
		
		double CircumOfCircle= 2*Math.PI*radius;
		System.out.println(CircumOfCircle);
		
		int CircumOfTringle= length*breath*height;
		System.out.println(CircumOfTringle);
		
		int CircumOfSquare= 4*a;
		System.out.println(CircumOfSquare);
		
		int CircumOfrectangle= 2*(length+breath);
		System.out.println(CircumOfrectangle);
		
		s1.close();
		

	}
	

}
