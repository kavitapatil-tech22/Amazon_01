package assignmentsPrgm;
public class AirthmaticPrgm {
	public static void main(String[] args) {
		//Assignment 4 : Write a Program to Create 4 static methods other than the main() method Addition,Subtraction,Multiplication,
		//Division & call inside the main() method	
		System.out.println("-----Dipaly Airthmatic operation results-----" );
		addition();
		subtraction();
		multiplication();
		division();		
	}
	static void addition() {
	    int a=10,b=20;
		int add;
		add=a+b;
		System.out.println("addition =" + add);
	}		
	static void subtraction() {
		int c=8,d=30;
		int sub=d-c;
		System.out.println("Subtraction =" + sub);
	}	
	static void multiplication() {
		int a=10,e=10;
		int multi= a * e;
		System.out.println("Multiplication =" + multi);
	}	
	static void division() {
		int d=20,f=40;
		float div= f/d;
		System.out.println("Division =" + div);
	}	
		
}
