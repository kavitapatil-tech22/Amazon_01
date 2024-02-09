package assignmentsPrgm;
import java.util.Scanner;
public class Single_Level_Inherit extends SuperClass
{
	// Assignment 12 : Create 1 super class with 2 static and 2 non static method & 1subclass with 2 non-static method. 
	//Through inheritance call all methods into main method(Single level inheritance)
	
	static Scanner sc=new Scanner(System.in);
	// non static method of sub class
	void circle()
	{
				//Scanner sc=new Scanner(System.in);
				System.out.println("Enter the radius");
				double rad=sc.nextDouble();				
				double area=(2*rad*rad)/7 ;				
				System.out.println(" Area of Circle is : "  + area);				
	}
	//  non static method of sub class
	void printName()
	{
		System.out.println("-----------Single Level Inheritance Program--------------");
		System.out.println("");
	}
	// non static method of sub class
	void areaTriangle()
	{
		System.out.println("Enter the base");
		double base=sc.nextDouble();
		System.out.println("Enter the height");
		double height=sc.nextDouble();		
		double area=(base*height)/2;
		System.out.println(" Area of Triangle is : "  + area);
	}
	public static void main(String[] args)
	{
		// creating the object for subclass
		Single_Level_Inherit sli=new Single_Level_Inherit();  
		sli.printName();       // calling non static method of subclass
		 
	     addition();                  // super class  of static method
	     subtraction();                // super class  of static method
	     sli.multiplication();  // super class  of non static method
	     sli.division();        // super class  of non static method
	
	     sli.circle();          // one non static method of subclass
	     sli.areaTriangle();     // one non static method of subclass
	     sc.close();
	}
}
// super class
class SuperClass 
{
	// static method of super class
	   static void addition() 
	   {		
			int a=10,b=20,sum =a+b;
			System.out.println(sum);
	   }
	// static method of super class
	   static void subtraction()
	   {
		   int a=10,b=20,sub =b-a;
			System.out.println(sub);			
	   }
	// non static method of super class
	   void multiplication() 
	   {	
	    	int a=10,b=20,multi =a*b;
			System.out.println(multi);
		}
	   // non static method of super class
	   void division() {		
	    	int a=10,b=20,div=b/a;
			System.out.println(div);
		}	 
  }

