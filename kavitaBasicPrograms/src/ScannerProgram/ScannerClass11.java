package ScannerProgram;

import java.util.Scanner;

public class ScannerClass11 {
public static void main(String[] args) {
	
	Scanner s1=new Scanner(System.in);
	//byte a=	s1.nextByte();
	int number=s1.nextInt();
	System.out.println("Entered number :" +number);
	s1.close();
   }
}
