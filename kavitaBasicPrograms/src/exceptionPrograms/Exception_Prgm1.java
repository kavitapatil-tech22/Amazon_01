package exceptionPrograms;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception_Prgm1 {
	public static void main(String[] args) {
		// Assignment 45/43 : Write program try catch block using scanner class get exception InputMisMatchException		
		Scanner sc=new Scanner(System.in);
		try
		{
			//int a=1/0;
			System.out.println("Enter a Integer Value");
			
			int a=sc.nextInt();	
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("output " +c);
		}
		catch(ArithmeticException ex) 
		{			
			System.out.println(ex);
		}
		catch(NullPointerException ex1) 
		{			
			System.out.println(ex1);
		}
		catch(InputMismatchException ex2)
		{
			System.out.println("Exception Name :  " + ex2);			
		}					
		finally {
			System.out.println("i am executing always");
			sc.close();
		}
		  
	}
}