package assignmentsPrgm;

public class Call_Static_NonStatic_OneClass {
	//Assignment 6: Write a program to call static method and non static method in one class
	
	//Static  method
	static void add()
	{
			int a=10, b=20;
			int sum = a+b;
			System.out.println(sum);
	}
	//static with parameter
	static void subtract(int c,double d) {
			double sub=d-c;
			System.out.println(sub);
	}	
	//non-static method
	void student() {
			String str="Vivaan";
			System.out.println("Student Name : "+ str);
	}
	//non static method with passing parameters
	void multiplication(int m,int n) {
			int multi=m*n;
			System.out.println(multi);
	}	
	public static void main(String[] args) {		
      add();             // calling static add ()
      subtract(20,30);   //  calling static subtract()
      
      Call_Static_NonStatic_OneClass scon1=new Call_Static_NonStatic_OneClass(); 
		
		// calling non static method without parameters
		scon1.student();
		
		//calling non static method with parameters
		scon1.multiplication(3, 4);
	}

}
