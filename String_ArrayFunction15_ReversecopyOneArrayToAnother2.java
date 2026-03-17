package automationBatch62;

import java.util.Arrays;

public class String_ArrayFunction15_ReversecopyOneArrayToAnother2 
{
	public static void main(String[] args) 
	{
		int[] InputArray= new int[7];
		InputArray[0]=24;
		InputArray[1]=48;
		InputArray[2]=84;
		InputArray[3]=164;
		InputArray[4]=328;
		InputArray[5]=656;
		InputArray[6]=1312;
		
		int[] OutputReverseArray=new int[InputArray.length];
		
		//for(int i=0;i<InputArray.length;i++)
			for(int i=0,j=InputArray.length-1;i<InputArray.length;i++,j--)
		{
			//OutputReverseArray[((InputArray.length-1)-i)]=InputArray[i];
			OutputReverseArray[j]=InputArray[i];
		}
		System.out.println( Arrays.toString(InputArray));
		System.out.println(Arrays.toString(OutputReverseArray));
			                
	}
	

	
	
}


