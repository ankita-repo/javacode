package automationBatch62;

abstract class AbstConcreMethod_program3
{
	abstract void method3();
	abstract void method4();
}
abstract class AbstConcreMethod_program5 extends AbstConcreMethod_program3
{
	abstract void method5();
	abstract void method6();
	
}

public class AbstConcreMethod_program4 extends AbstConcreMethod_program5
{
	static void method7()
	{
		System.out.println("Logic for Login");
	}
	
	public static void main(String[] args) 
	{
		AbstConcreMethod_program4 p1= new AbstConcreMethod_program4();
		p1.method3();
		p1.method4();
		p1.method5();
		p1.method6();
		method7();

	}

	void method5() 
	{
		
		System.out.println("I am method 5");
	}

	void method6() 
	{
		
		System.out.println("I am method 6");
		
	}

	void method3() 
	{
		
		System.out.println("I am method 3");
	}

	void method4() 
	{
		System.out.println("I am method 4");
		
	}

	
}
