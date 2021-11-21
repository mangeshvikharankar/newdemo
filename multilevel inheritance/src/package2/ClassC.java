package package2;

import package1.ClassB;

public class ClassC extends ClassB
{

	

	public ClassC(int c) {
		super(c);
		
	}

	public static void testC()
	{
	System.out.println("Static test Class C");

	}

	public void demoC()
	{
	System.out.println("Non static test Class C");

	}
	
	
}
