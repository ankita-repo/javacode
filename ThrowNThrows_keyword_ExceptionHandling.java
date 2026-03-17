package automationBatch62;

public class ThrowNThrows_keyword_ExceptionHandling 
{

	public static void main(String[] args) throws NullPointerException,ArithmeticException
	{
		if(1>1)
		{
			throw new NullPointerException("You are trying to fecth the data from empty cell");	
		}
		else
		{
			throw new ArithmeticException("Because of infinite");
		}
		
		
		


	}

}
