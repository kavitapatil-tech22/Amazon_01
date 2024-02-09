package assignmentsPrgm;
public class Static_NonStatic_Constructor_OneClass {
	//Assignment 7: Write a program to call constructor and call static method and non static method in one class
		//Constructor without parameter
		Static_NonStatic_Constructor_OneClass(){		
			System.out.println("Hi ! KAVITA");
		}	
		// constructor with parameter
		Static_NonStatic_Constructor_OneClass(String str1){	
			 System.out.println(str1);
		}	
		//Static  method
		static void add() {
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
		// constructor are called automatically when we created object
				Static_NonStatic_Constructor_OneClass scon1=new Static_NonStatic_Constructor_OneClass(); 
				
				// calling non static method without parameters
				scon1.student();				
				
				//calling non static method with parameters
				scon1.multiplication(3, 4);
				
				// calling static method without parameter
				add();
				
				// calling static method with passing parameter
				subtract(5,10.30);  
				
				//calling parameterized constructor
				new Static_NonStatic_Constructor_OneClass("Santosh");	
	}
}
