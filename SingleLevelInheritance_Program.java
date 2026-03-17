package automationBatch62;

 class SingleLevelInheritance_Program2
{
	void add()
	{
      System.out.println("I am single level inheritance");
	}


}
public class SingleLevelInheritance_Program extends SingleLevelInheritance_Program2
{
void sub()
{
	System.out.println("I am a part of Single level inheritance");
}
	public static void main(String[] args) 
	{
		SingleLevelInheritance_Program s1= new SingleLevelInheritance_Program();
		s1.add();
		s1.sub();


	}

}
