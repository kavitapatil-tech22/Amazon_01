package assignmentsPrgm;
import java.util.Scanner;
public class Assignment42 {
	// Assignment 42 : Find area of a circle run the for loop for 10 times using math class.
	static Scanner sc=new Scanner(System.in);
	void AreaOfCircle() 
	{	
		for(int i=1;i<=10;i++)		{
			System.out.print("Enter the radius value for " +i+" attempt : ");			
			double radius=sc.nextDouble();
			double Area=Math.PI*radius*radius; 
			System.out.println("Area of the Circle is : " +Area);
			System.out.println("");
		}
	}
	public static void main(String[] args) {		
		Assignment42 assign=new Assignment42();
		assign.AreaOfCircle();		
		sc.close();
	}
}
