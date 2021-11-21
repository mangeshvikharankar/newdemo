package package2;
//Multilevel inheritance can be performed between 3 or more classes.
import package1.ClassA;
import package1.ClassB;

public class Main_method 
{

	ClassC y = new ClassC(0);
	

	public static void main(String[] args) 
	{
		ClassC.testA();
		ClassC.testB();
		ClassC.testC();
	
		ClassC x = new ClassC(0);
         x.demoA();
         x.demoB();
         x.demoC();
         

	}

}
