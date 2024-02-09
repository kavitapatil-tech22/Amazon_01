package assignmentsPrgm;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment43 {
	public static void main(String[] args) {
		// Assignment 43 : Write program try catch block using scanner class get exception InputMisMatchException		
		try		{
			//int a=1/0;
			System.out.println("Enter a Integer Value");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();					
			System.out.println(a);
		}
		catch(InputMismatchException ex2){
			System.out.println("Exception Occured :  " +ex2);			
		}	
		catch(ArithmeticException ex) 		{			
			System.out.println("Exception Occured : " +ex);
		}
		catch(NullPointerException ex1) 		{			
			System.out.println("Exception Occured : " +ex1);
		}		
	}
}
