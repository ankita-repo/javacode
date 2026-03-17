package automationBatch62;

import java.util.Arrays;
import java.util.Scanner;

public class String_ArrayFunction12_UsingScanner 
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Please enter the size of Array");
		int rollNo[]=new int[s1.nextInt()];
		for(int i=0;i<rollNo.length;i++)
		{
			System.out.println("Please Enter the value of Array at indexing->"+i);
			rollNo[i]=s1.nextInt();
			
		}
		
		System.out.println("The Final Array Output:-");
		System.out.println(Arrays.toString(rollNo));
		s1.close();
	}
	
			
		
		 
	 
	
	/*String name[]=new String[5];
	name[0]="Ankita";
	name[1]="Keshav";
	name[2]="Athrav";
	name[3]="Asmita";
	name[4]="Amrita";
	System.out.println(Arrays.toString(name));
	
	char FirstletterOfName[]= new char[5];
	FirstletterOfName[0]='A';
	FirstletterOfName[1]='K';
	FirstletterOfName[2]='A';
	FirstletterOfName[3]='A';
	FirstletterOfName[4]='A';
	System.out.println(Arrays.toString(FirstletterOfName));

	boolean genderOfStudentis_Female[]=new boolean[5];	
	genderOfStudentis_Female[0]=true;
	genderOfStudentis_Female[1]=false;
	genderOfStudentis_Female[2]=false;
	genderOfStudentis_Female[3]=true;
	genderOfStudentis_Female[4]=true;
	System.out.println(Arrays.toString(genderOfStudentis_Female));
	
	double WeightOfStudent[]=new double[5];
	WeightOfStudent[0]=58.09;
	WeightOfStudent[1]=69.65;
	WeightOfStudent[2]=10.12;
	WeightOfStudent[3]=48.90;
	WeightOfStudent[4]=50.50;
	System.out.println(Arrays.toString(WeightOfStudent));*/
		


	}


