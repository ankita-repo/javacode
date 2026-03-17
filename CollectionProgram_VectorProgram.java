package automationBatch62;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class CollectionProgram_VectorProgram 
{

	public static void main(String[] args) 
	{
				Vector v1= new Vector();
				v1.add(22);
				v1.add(33);
				v1.add(44);
				v1.add(55);
				v1.add(66);
				System.out.println(v1);
				
				v1.iterator();
				v1.listIterator();
			Enumeration e1=	v1.elements();
			while(e1.hasMoreElements())
			{
				System.out.println(e1.nextElement());
			}
		
	}
}

