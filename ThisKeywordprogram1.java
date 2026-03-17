package automationBatch62;

public class ThisKeywordprogram1 
{
	int stdID;
	double pocketMoney;
	String stdName;
	void stdDetails(int stdID,double pocketMoney,String stdName)
	{
		this.pocketMoney=pocketMoney;
		this.stdID=stdID;
		this.stdName=stdName;
		
	}

	public static void main(String[] args) 
	{
		ThisKeywordprogram1 ts= new ThisKeywordprogram1();
		ts.stdDetails(41, 100.9, "Ankita");
		System.out.println(ts.stdID);
		System.out.println(ts.pocketMoney);
		System.out.println(ts.stdName);


	}

}
