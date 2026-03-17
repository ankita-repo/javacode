package automationBatch62;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListProgram8_ListProperty2 
{

	public static void main(String[] args) 
	{
				List<Integer> l1=new ArrayList<Integer>();
				l1.add(20);
				l1.add(30);
				l1.add(40);
				l1.add(50);
				System.out.println(l1);
				
			Iterator<Integer> i1=l1.iterator();
			
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			System.out.println("Iterating using ListIterator:  hasnext");
          ListIterator<Integer> i2= l1.listIterator();
          while(i2.hasNext())
          {
        	  System.out.println(i2.next());
          }
          System.out.println("Iterating using ListIterator:  hasprevious");
          while(i2.hasPrevious())
          {
        	  System.out.println(i2.previous());
          }
		
	}
}

