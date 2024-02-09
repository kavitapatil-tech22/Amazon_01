package assignmentsPrgm;
/*  In the multilevel inheritance of 4 classes downcast from 3 to 2 class
Classes :
4 
3
2
1
 * 
 * */
class Class1 
{
 void displayClass1()
 {
     System.out.println("Inside Class1");
 }
}

//Class 2 extends Class1
class Class2 extends Class1
{
 void displayClass2() 
 {
     System.out.println("Inside Class2");
 }
}

//Class 3 extends Class2
class Class3 extends Class2 
{
 void displayClass3()
 {
     System.out.println("Inside Class3");
 }
}

//Class 4 extends Class3

class Class4 extends Class3 
{
 void displayClass4() 
 {
     System.out.println("Inside Class4");
 }
}

public class Assignment48_test extends Class3
{
	
	public static void main(String[] args) 
	{
		
//		Class1 a=new Assignment48_test();
//		
//		// downcasting
//		
//		Class2 c2=(Class2)a;   // class2 is downcasting
		
		// Creating an instance of Class3
	     Class3 obj3 = new Class3();

	     // Downcasting from Class3 to Class2
	     Class2 obj2 = (Class2) obj3;

	     // Accessing Class2 method using the downcasted object
	     obj2.displayClass1(); // Accessing Class1 method
	     obj2.displayClass2(); // Accessing Class2 method

	     // This line will cause a compilation error or runtime error
	     // obj2.displayClass3(); // Class2 doesn't have access to Class3's methods
	}
 
}
