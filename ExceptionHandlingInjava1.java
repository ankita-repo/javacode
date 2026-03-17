package automationBatch62;

public class ExceptionHandlingInjava1

{
			public static void main(String[] args) 
			{
				try 
				{	
				int c=1/0;  //c=a/b;
				String a1="Ankita";
				a1.charAt(5);
				System.out.println(c);
				}
				catch(ArithmeticException a1)
				{
					System.out.println("Hanlded the exception 1");
				}
				catch(StringIndexOutOfBoundsException a2)
				{
					System.out.println("Hanlded the exception 2");
				}
				catch(ArrayIndexOutOfBoundsException a2)
				{
					System.out.println("Hanlded the exception 3");
				}
			}
		
	}


