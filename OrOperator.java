package automationBatch62;

public class OrOperator {

	public static void main(String[] args) 
	{
		int age= 18;
		char gender='F';
		boolean metrocity= false;
		if(age>=18||metrocity==true && age>=18||gender=='F')
		{
			System.out.println("Statement will execute");
		}
		System.out.println("Statement will not execute");
		

	}

}
