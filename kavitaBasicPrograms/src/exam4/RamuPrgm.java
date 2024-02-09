package exam4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class RamuPrgm {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int numbers[]= new int[4];
		System.out.println("Enter the values to the arrays");
		try
		{	
			numbers[0]=s1.nextInt();
			numbers[1]=s1.nextInt();
			int c=(numbers[0]/numbers[2]);
			System.out.println(c);		
			try 
			{
			   numbers[0]=s1.nextInt();
			}
			catch(IndexOutOfBoundsException ex1)
			{
				System.out.println("IndexOutOfBounds exceptions captured");
			}						
		}
		catch(IndexOutOfBoundsException ex1)
		{
			System.out.println("IndexOutOfBounds exceptions captured");
		}		
		catch(ArithmeticException ex2)
			{
				System.out.println("ArithmeticException exception occured");
			}
		
		catch(InputMismatchException ex1)
		{
			System.out.println("InputMismatchException occured");
		}
		
		finally
		{
			System.out.println("Default finally block");
		}
	}
}
