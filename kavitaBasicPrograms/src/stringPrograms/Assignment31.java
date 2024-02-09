package stringPrograms;

import java.util.Scanner;

public class Assignment31 {
  /*Assignment 31: Take any string Example: "Ram Tiwari "and it should display as Tiwari Ram   */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		//String str="Kavita Patil";
		
		String output=str.replace(str, "Patil Kavita");
		System.out.println("");
		System.out.println("Output is : ");
		System.out.println(output);
		sc.close();
		
	}
}
