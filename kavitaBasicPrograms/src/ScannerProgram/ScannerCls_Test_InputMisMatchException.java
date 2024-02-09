package ScannerProgram;
import java.util.Scanner;
public class ScannerCls_Test_InputMisMatchException 
{
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
		
		//byte a=	s1.nextByte();
		//short b=s1.nextShort();
		//int c=	s1.nextInt();
		//long d=	s1.nextLong();
		//float e=s1.nextFloat();
		//double f=s1.nextDouble();
		//boolean g=s1.nextBoolean();
		//String name=s1.next();
		s1.close();
	}
}
