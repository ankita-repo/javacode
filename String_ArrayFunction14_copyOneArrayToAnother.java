package automationBatch62;

import java.util.Arrays;

public class String_ArrayFunction14_copyOneArrayToAnother 
{
	public static void main(String[] args) 
	{
		int[] Input=new int[4];
		Input[0]=10;
		Input[1]=20;
		Input[2]=30;
		Input[3]=40;
		
		int[] Output=new int [Input.length];
		
		for(int i=0;i<Input.length;i++)
		{
			Output[i]=Input[i];
		}
		System.out.println( Arrays.toString(Input));
		System.out.println(Arrays.toString(Output));
			                
	}
	

	
	
}


