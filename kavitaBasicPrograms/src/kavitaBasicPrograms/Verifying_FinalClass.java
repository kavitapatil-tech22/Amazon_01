package kavitaBasicPrograms;
// Assignmnet 15: Create two classes.Make the second class final. Class one extends two.Once you make a class final it cannot be inherited
//super most class
 class SuperMost_Class1
{	
	void print1()
	{
		System.out.println("super most class");
	}
}
//super class
class SuperClass extends SuperMost_Class1
{	
	void print2()
	{
		System.out.println("super class");
	}
}
//sub class
public class Verifying_FinalClass extends SuperClass
{	
	public static void main(String[] args)
	{
		System.out.println("print subclass");
		Verifying_FinalClass vf=new Verifying_FinalClass();
		vf.print2();
		vf.print1();
	}   
}