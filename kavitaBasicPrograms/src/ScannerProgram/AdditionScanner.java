package ScannerProgram;
import java.util.Scanner;
public class AdditionScanner {
	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("ENter the value of Number 1");
		int no1=s1.nextInt();
		System.out.println("ENter the value of Number 2");
		int no2=s1.nextInt();
		int sum=no1+no2;
		System.out.println("The sum of two numbers is="+sum);
		s1.close();	
	}
}
