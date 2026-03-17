package automationBatch62;

public class String_ArrayFunction16_AvarageValueOfGivenArray 
{
	public static void main(String[] args) 
	{
		int [] givenInput=new int[5];
		givenInput[0]=56;
		givenInput[1]=65;
		givenInput[2]=45;
		givenInput[3]=54;
		givenInput[4]=75;
		
		int Sum=0;
		for(int i=0;i<givenInput.length;i++)
		{
			Sum=Sum+givenInput[i];
		}
		System.out.println(Sum);
		double average=Sum/givenInput.length;
		System.out.println("average of given string is>:"+ average);
		
		
		
		
	}
	

	
	
}


