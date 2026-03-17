package automationBatch62;

import java.util.ArrayList;

public class ArrayListProgram3 {

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
		boolean b1=a1.isEmpty();
		System.out.println(b1);
		//a1.clear();
		//System.out.println(a1);
		
		System.out.println(a1);
		
		a1.remove(0);
		System.out.println("Remove from index position 0>-"+a1);
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("Sayli");
		a2.addAll(a1);
		System.out.println(a2);
		
		a2.removeAll(a1);
		System.out.println("remove entite collection a1 from a2>-"+a2);
		
		


	}

}
