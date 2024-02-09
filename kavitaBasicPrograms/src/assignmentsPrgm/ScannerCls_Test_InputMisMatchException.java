package assignmentsPrgm;
import java.util.Scanner;
public class ScannerCls_Test_InputMisMatchException 
{
	// Assignment 11: try to input different data types then look into the InputMismatchException
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
	    System.out.println("Entered number " + "'" + s1.nextByte() +"'"  + " is Byte value");
		System.out.println("Entered number " + "'"  + s1.nextShort() +"'"  + " is Short value");
		System.out.println("Entered number " + "'" + s1.nextInt() +"'"  + " is Intger value" );
		System.out.println("Entered number "+ "'" + s1.nextLong() +"'"  + " is Long value");
		System.out.println("Entered number " + "'" + s1.nextFloat() +"'"  + " is Float value");
		System.out.println("Entered number "+ "'"  + s1.nextDouble() +"'"  + " is Double value");		
		System.out.println("Entered value "+ "'" + s1.nextBoolean() +"'"  + " is Boolean value");
		System.out.println("Entered String "+ "'" + s1.next() +"'"  + " is String value");
		s1.close();
		
	}
}
