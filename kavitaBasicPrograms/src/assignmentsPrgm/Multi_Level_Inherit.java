package assignmentsPrgm;

//Assignment 13 :
//Create Super most class with 2 non static methods, super class with 2 static method, 
//subclass with 2 non-static method.Call them all inside main method(Multilevel inheritance)

// sub class
public class Multi_Level_Inherit extends SuperClass_2
{
	void Print2() {
		System.out.println("non static method- Sub Class");
	}
	static void display2()
	{
		System.out.println("static method- Sub Class");
	}
	public static void main(String[] args) 
	{
		Multi_Level_Inherit mli=new Multi_Level_Inherit();
		mli.Print();   // non static method of super most class
		display();     // static method of super most class
		mli.Print1();	// non static method of super class	
		display1();     // static method of super class
		
		mli.Print2();   // non static method of sub class 
		display2();      // static method of sub class
	}
}
// super most class
class Most_SuperClass_1
{
	static int a=10;
	void Print() {	
		System.out.println("------- Multi Level Inheritance Program ------");
		System.out.println("");
		System.out.println("non static method- Super Most Class");		
	}
	static void display()
	{
		a=40;
		int b=20;
		System.out.println("static method- Super Most Class");
		
		System.out.println("most super class global variable a value is : " +a);
		System.out.println("most super class local variable  b value is : " + b);
	}
}
// super class
class SuperClass_2 extends  Most_SuperClass_1
{
	void Print1() {
		System.out.println("-------------------------------------------");
		System.out.println("non static - Super Class");
	}
	static void display1()
	{
		System.out.println("static method- Super Class");
		System.out.println("-------------------------------------------");
	}
	
}
