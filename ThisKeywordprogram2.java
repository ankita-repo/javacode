package automationBatch62;

public class ThisKeywordprogram2 
{
	int stdID;
	double pocketMoney;
	String stdName;
	void stdDetails(int stdID,double pocketMoney,String stdName)
	{
		System.out.println("Student id is -> "+ stdID);
		System.out.println("Student pocketMoney is -> "+ pocketMoney);
		System.out.println("Student stdName is -> "+ stdName);
		
	}

	public static void main(String[] args) 
	{
		ThisKeywordprogram2 ts= new ThisKeywordprogram2();
		ts.stdDetails(41, 100, "Ankita");
		System.out.println(ts.stdID);
		System.out.println(ts.pocketMoney);
		System.out.println(ts.stdName);


	}

}
