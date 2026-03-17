package automationBatch62;

import java.util.Arrays;

public class String_ArrayFunction11_HandlingException 
{

	public static void main(String[] args) 
	{
		try
		{
			int rollNo[]= new int[4];
			
			rollNo[0]=12;
			rollNo[1]=21;
			rollNo[2]=39;
			rollNo[3]=50;
			rollNo[4]=20;
			
			System.out.println(Arrays.toString(rollNo));
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled");
			
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

}
