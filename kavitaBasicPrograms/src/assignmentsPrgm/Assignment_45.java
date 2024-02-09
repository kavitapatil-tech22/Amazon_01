package assignmentsPrgm;
import java.util.Scanner;
/* Assignment 45 : Write a switch case program 
using scanner class 
case 1: Addition with 'a' and 'b'
case 2: Subtraction with 'a' and 'b'
case 3: Multiplication with 'a' and 'b'
case 4: Division with 'a' and 'b'
here 'a' and 'b' values should come 
from Scanner class.  */
public class Assignment_45 {  
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a & b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.print("Select the case which you want to perform Operation : ");
		int c=sc.nextInt();
		System.out.println(" ");
		switch(c)
		{		
		case 1:System.out.println("Case 1 is Selected Arithematic Operation is: Addition");
				int Addition = a+b;
				System.out.println(Addition);
				break;		
		case 2:System.out.println("Case 2 is Selected Arithematic Operation is: Subtraction");
				int Subtraction=a-b;
				System.out.println(Subtraction);
				break;		
		case 3:System.out.println("Case 3 is Selected Arithematic Operation is: Multiplication");
				int Multiplication=a*b;
				System.out.println(Multiplication);
				break;		
		case 4:System.out.println("Case 4 is Selected Arithematic Operation is: Division");
				int Divide=a/b;
				System.out.println(Divide);
				break;				
		default:System.out.println("No case is selected");		
		}
	}
}
