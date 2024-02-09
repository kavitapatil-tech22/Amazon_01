package ScannerProgram;
import java.util.Scanner;
public class ScannerClass_Airthmatic_Operation {
	//Assignment 10: try to create 4 arithmetic operation methods and call in main method using scanner class
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		//creating object for class with the help of reference variable
		ScannerClass_Airthmatic_Operation sct=new ScannerClass_Airthmatic_Operation();
		   add();
		   sct.sub();
		   sct.multipl();
		   sct.div();
		   sc.close();		   
	}	
	static void add() 
	{	
		 System.out.println("Enter the value a and b");
		 int a= sc.nextInt();
		 int b= sc.nextInt();
		 int sum=a+b;
		 System.out.println("Sum of the two number is :" + sum);		
	}	 
	void sub() 
	{			
		System.out.println("Enter the value a and b");
		int a= sc.nextInt();
     	int b= sc.nextInt();
		int sub=a-b;
	    System.out.println("Subtraction of the two number is :" + sub);			  
	}	 
	void multipl() {
		 System.out.println("Enter the value a and b");
		 int a= sc.nextInt();
		 int b= sc.nextInt();
		 int multipl=a*b;
		 System.out.println("Multiplication of the two number is :" + multipl);		
	 }
	void div()
	{
	    System.out.println("Enter the value a and b");
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    double div=b/a;
	    System.out.println("Division of the two numbers is :" + div);
	 }
	
}
