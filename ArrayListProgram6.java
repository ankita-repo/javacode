package automationBatch62;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgram6 
{

	public static void main(String[] args) 
	{
		ArrayList<Character> a1= new ArrayList<Character>();
		a1.add('A');
		a1.add('B');
		a1.add('C');
		a1.add('D');
		a1.add('E');
		a1.add('F');
		
		System.out.println(a1);
		Iterator<Character> i1=a1.iterator();
		
		System.out.println("Forward Iteration using Iterator:");
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator<Character> i2=a1.listIterator();
		System.out.println("Forward Iteration using ListIterator:");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Backward Iteration using ListIterator ");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
		
		
	
		
		


	}

}
