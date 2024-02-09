package assignmentsPrgm;

import java.util.Scanner;
public class ScannerClass_Airthmatic_Operation {
	//Assignment 11: try to create 4 arithmetic operation methods and call in main method using scanner class
	  static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		ScannerClass_Airthmatic_Operation sct=new ScannerClass_Airthmatic_Operation();
		   sct.add1();
		   sct.sub();
		   sct.multipl();
		   sct.div();
//		add1();
//		sub();
//		multipl();
//		div();
		   sc.close();
	}	
	 void add1() 
	{
		 System.out.println("Entere the value 1 and 2");
		 int a= sc.nextInt();
		 int b= sc.nextInt();
		  int sum=a+b;
		  System.out.println("sum of the two num is :" + sum);
	}	 
	  void sub() 
		{
			//Scanner sc=new Scanner(System.in);
			 System.out.println("Entere the value 1 and 2");
			 int a= sc.nextInt();
			 int b= sc.nextInt();
			  int sub=a-b;
			  System.out.println("subtraction of the two num is :" + sub);			 
		} 
	 void multipl() {
		 System.out.println("Entere the value 1 and 2");
		 int a= sc.nextInt();
		 int b= sc.nextInt();
		  int multipl=a*b;
		  System.out.println("multiplication of the two num is :" + multipl);	 
	 }
	 void div()
	{
	 System.out.println("Entere the value 1 and 2");
	 int a= sc.nextInt();
	 int b= sc.nextInt();
	  double div=b/a;
	  System.out.println("division of the two num is :" + div);
	      
	 }
	
}
