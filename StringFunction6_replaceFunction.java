package automationBatch62;

public class StringFunction6_replaceFunction {

	public static void main(String[] args) 
	{
		String a="ram";
		String a1=a.replace('r', 'R');
		System.out.println(a1);
		
		String b= "Automation Testing";
		String b1=b.replace("Automation", "Manual");
		System.out.println(b1);
		
		
		//replace all smaller letters
		String d="Ankita Keshav Prakash";
		String d1=d.replaceAll("[a-z]", "");
		System.out.println(d1);
		
		
		//replace all numeric value
		String c= "Ankita987654Kumari6789";
		String c1=c.replaceAll("[1-9]", "");
		System.out.println(c1);
		
		

	}

}
