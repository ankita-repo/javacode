package automationBatch62;

import java.util.LinkedList;

public class LinkedList_Method {

	public static void main(String[] args) 
	{
		LinkedList l1= new LinkedList();
		l1.add("Ankita");
		l1.add("Bhawani");
		l1.add("Asmita");
		System.out.println(l1);
		boolean b1=l1.offer("Kumari");
		
		System.out.println(b1);
		boolean b2=l1.offerFirst("Prasad");
		System.out.println(b2);
		boolean b3=l1.offerLast("Shah");
		System.out.println(b3);
		System.out.println(l1);
		
		l1.poll();
		System.out.println(l1);
	    l1.peek();
		System.out.println(l1.peek());
		
		


	}

}
