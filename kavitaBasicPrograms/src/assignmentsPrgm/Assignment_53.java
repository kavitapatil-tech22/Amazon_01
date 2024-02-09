package assignmentsPrgm;

import java.util.Scanner;
public class Assignment_53 {
	/* Assignment 53:  Date: 17/01/2024
   find out the even and odd num 1 to 100 without using if and else  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);          
	       System.out.print(" Enter the max number: ");
	       int num = sc.nextInt();
	       System.out.print("\n Even numnbers : ");
	       for(int i=0;i<=num;i+=2)
	       {
	          System.out.print(i +" ");
	       }
	       System.out.print("\n\n Odd numbers : ");
	       for(int i=1;i<=num;i+=2)
	       {
	          System.out.print(i +" ");
	       }
	}
}
