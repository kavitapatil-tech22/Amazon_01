package kavitaBasicPrograms;
import java.util.Scanner;
public class SLI_Sub_Class1 extends SLI_SuperClass1
{
	// Assignment 12 : Create 1 super class with 2 static and 2 non static method & 1subclass with 2 non-static method. 
		//Through inheritance call all methods into main method(Single level inheritance)
	
	//non static method of subclass
	void circle()
	{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the radius");
				double rad=sc.nextDouble();
				
				double area=(2*rad*rad)/7 ;
				
				System.out.println(" Area of Circle is : "  + area);
				sc.close();
	}
	// non static method of sub class
	void printName()
	{
		System.out.println("Single Level Inheritance Program");
	}
	public static void main(String[] args) 
	{
		SLI_Sub_Class1  sli_subcls=new SLI_Sub_Class1();
		sli_subcls.printName();       // calling non static method of subclass
		addition();                  // super class  of static method
		subtraction();                // super class  of static method
		sli_subcls.multiplication();  // super class  of non static method
		sli_subcls.division();        // super class  of non static method
		
		sli_subcls.circle();          // one non static method of subclass
		
	}
		
}
class SLI_SuperClass1
{
	
   static void addition() {
		
		int a=10,b=20,sum =a+b;
		System.out.println(sum);
	}
    static void subtraction() {
	   int a=10,b=20,sub =a-b;
		System.out.println(sub);			
	}
    void multiplication() {
		
    	int a=10,b=20,multi =a*b;
		System.out.println(multi);
	}
    void division() {		
    	int a=10,b=20,div=a/b;
		System.out.println(div);
	}
 
}


