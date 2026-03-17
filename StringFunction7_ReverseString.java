package automationBatch62;

public class StringFunction7_ReverseString {

	public static void main(String[] args) 
	{
		String a="Ankita";
		String reversea="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			char c=a.charAt(i); 
			
		    reversea=reversea+c;
		        					 
		}
	
		 System.out.println(reversea);

	}

}
