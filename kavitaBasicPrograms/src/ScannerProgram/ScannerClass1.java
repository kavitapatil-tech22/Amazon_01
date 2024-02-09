package ScannerProgram;

import java.util.Scanner;

public class ScannerClass1 
{
	// simple program to print person age using scanner class
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Person age : ");
		int age=s1.nextInt();
		System.out.println("The Person age is : "  + age );
		s1.close();
	}

}
