package automationBatch62;

import java.util.Arrays;
import java.util.Scanner;

public class String_ArrayFunction13_CheckTwoArraysEqual 
{

	public static void main(String[] args) 
	{
		int input1[]= new int[4];
		input1[0]=10;
		input1[1]=20;
		input1[2]=30;
		input1[3]=40;
		int input2[]= new int[input1.length];
		input2[0]=10;
		input2[1]=20;
		input2[2]=30;
		input2[3]=40;
		
		boolean A=Arrays.equals(input1, input2);
		//A== true;
		//Arrays.equals(input1, input2)==true;
		//
		if(Arrays.equals(input1, input2))
		{
			System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Both Arrays are not equal");
		}
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


