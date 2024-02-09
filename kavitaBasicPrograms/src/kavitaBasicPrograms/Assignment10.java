package kavitaBasicPrograms;

import java.util.Scanner;

public class Assignment10 {
 
	static Scanner sc1=new Scanner(System.in);
	 public static void main(String[] args) 
	 {
			
			Assignment10 sca=new Assignment10();
			   sca.add();
			   sca.multipl();
			   sca.div();
			   sca.sub();
			   sc1.close();
	}

	void add() 
	{	
		 System.out.println("Enter value 1");
		 int a= sc1.nextInt();
		 System.out.println("Enter value 2");
		 int b= sc1.nextInt();
		 int sum=a+b;
		 System.out.println("Addition " + sum);		
	}	 
	void sub() 
	{			
		System.out.println("Enter value 1");
		int a= sc1.nextInt();
		System.out.println("Enter value 2");
     	int b= sc1.nextInt();
		int sub=a-b;
	    System.out.println("Subtraction" + sub);			  
	}	 
	void multipl() {
		 System.out.println("Enter value 1");
		 int a= sc1.nextInt();
		 System.out.println("Enter value 2");
		 int b= sc1.nextInt();
		 int multipl=a*b;
		 System.out.println("Multiplication " + multipl);		
	 }
	void div()
	{
	    System.out.println("Enter value 1");
	    int a= sc1.nextInt();
	    System.out.println("Enter value 2");
	    int b= sc1.nextInt();
	    double div=b/a;
	    System.out.println("Division " + div);
	 }
	
    
}
