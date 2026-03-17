package automationBatch62;

import java.util.Date;

public class DateClass_CFTime 
{

	public static void main(String[] args) 
	{
		Date d1= new Date();
		System.out.println(d1); // getting time in this format Mon Feb 23 07:57:13 IST 2026
		d1.getTime();           //using this to get value in long
        Date d2= new Date(d1.getTime());
        System.out.println(d2);
        String format1= d2.toString();// converting in string to apply string function
        String Date= format1.substring(8, 10);
        System.out.println(Date);
        String month=format1.substring(4, 7);
        System.out.println(month);
        String Year= format1.substring(format1.length()-4);
        System.out.println(Year);
        String hour= format1.substring(11, 13);  
        System.out.println(hour);
        String min=format1.substring(14, 16);
        System.out.println(min);
        String Sec=format1.substring(17, 19);
        System.out.println(Sec);
        
        String format2= Date.concat(" ").concat(month).concat(" ").concat(Year).concat(" ").concat(hour).concat(" ").concat(min).concat(" ").concat(Sec);
      System.out.println(format2);
	}
	
	

}
