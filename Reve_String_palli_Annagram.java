package selenium_Auto62;

public class Reve_String_palli_Annagram 
{

	public static void main(String[] args) 
	{
		String input= "Ankita";
		String input1=input.toLowerCase();
		System.out.println(input1);
		
		String inputrev="";
		for(int i=input1.length()-1;i>=0;i--)
		{
		char a =input1.charAt(i);
			inputrev= inputrev+ a;
		}
		System.out.println(inputrev);
		

	}

}
