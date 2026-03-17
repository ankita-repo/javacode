package automationBatch62;

import java.util.ArrayList;

public class ArrayListProgram2 {

	public static void main(String[] args) 
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Ankita");
		a1.add("Asmita");
		a1.add("Sonu");
		a1.add("Amit");
		a1.add("Athrav");
		a1.add("Keshav");
		a1.add(1,"Ankit");
		
		System.out.println(a1);
		
		
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("Sayli");
		a2.addAll(a1);
		System.out.println(a2);


	}

}
