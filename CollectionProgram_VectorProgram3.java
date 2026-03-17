package automationBatch62;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class CollectionProgram_VectorProgram3 
{

	public static void main(String[] args) 
	{
				Vector<Integer> v1= new Vector<Integer>();
				v1.addElement(21);
				v1.addElement(22);
				v1.addElement(23);
				v1.addElement(24);
				v1.addElement(25);
				
				System.out.println(v1);
				Integer i1=v1.firstElement();
				Integer i2=v1.lastElement();
				System.out.println("First Element of Array is"+ " "+i1);
				System.out.println("Last Element of Array is"+" "+ i2);
				
				v1.remove(i2);
				System.out.println(v1);
				Integer i3=v1.remove(2);
				System.out.println("Revoing Element of given Index 2"+" "+ i3);
				System.out.println(v1);
				
				 //v1.removeAllElements();
				 System.out.println(v1);
				 
				Integer i4= v1.capacity();
				System.out.println("Capacity of the Array"+  i4);
			
				Enumeration<Integer> e1=v1.elements();
				while(e1.hasMoreElements())
				{
					System.out.println(e1.nextElement());
				}
							
}
}

