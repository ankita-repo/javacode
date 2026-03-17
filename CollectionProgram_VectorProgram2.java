package automationBatch62;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class CollectionProgram_VectorProgram2 
{

	public static void main(String[] args) 
	{
				Vector<Integer> v1= new Vector<Integer>();
				v1.addElement(21);
				v1.addElement(22);
				v1.addElement(23);
				v1.addElement(24);
				v1.addElement(25);
				v1.addElement(28);
				v1.addElement(29);
				v1.addElement(30);
				
				v1.capacity();
				System.out.println("Capacity of "+ v1.capacity());
				
				System.out.println(v1);
				Enumeration<Integer> e1=v1.elements();
				while(e1.hasMoreElements())
				{
					System.out.println(e1.nextElement());
				}
							
}
}

