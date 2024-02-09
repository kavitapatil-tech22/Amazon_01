package assignmentsPrgm;
// Assignment 17 : Method Overriding with Multi level inheritance
class Super_Most_Class
{
	void display() {
		System.out.println("Super most Class Display method");
	}		
}
class Super_Class extends Super_Most_Class
{
	Super_Class()
	{
		System.out.println("Constructor");
	}
   void print() {
		System.out.println("Super Class non static method");
	}	
//	 static void print2() {
//		 System.out.println("Super class Static method");
//	 } 
}
class Sub_class extends Super_Class
{
	 void print() 
	 {		 
		System.out.println("Sub Class non static Method");
		//super.print();   // try to load super class method along with sub class then using super keyword we can achieve
		//super();
	}	
	 void display() 
	 {		 
		System.out.println("Sub Class non static Method");		
	  }	
//	static void display1() 
//	 {		 
//		System.out.println("Sub Class static Method");		
//	  }	
}
public class MethodOverriding_Class {

	public static void main(String[] args) {
		Sub_class sc=new Sub_class();
		sc.display();             // super most class non static method	, sub class method implimentation
		sc.print();             //sub class non static method implementation get called
		//sc.print1();
		//Super_Class.print2();   // super class static method		
			
		//Sub_class.display1();   // sub class static method
	}	
}
