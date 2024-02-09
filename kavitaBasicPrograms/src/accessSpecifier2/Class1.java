package accessSpecifier2;

public class Class1 
{

	public static void main(String[] args)
	{
	
		Class2 a1= new Class2();
		//a1.method1();//private static void method1() can't be accessed
		a1.method2();
		//a1.method3();
		a1.method4();
		a1.method5();
	
		
		
	}

}
