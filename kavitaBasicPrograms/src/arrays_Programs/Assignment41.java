package arrays_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment41 {
	public static void main(String[] args) {
		// Assignment 41: Find out the average in the array of length 5 with double data type
		
		System.out.println("Enter the double data type array elemnets");
		 Scanner sc=new Scanner(System.in);
		 double d[]= new double[5];
		 double sum=0;
		 for(int i=0;i<5;i++) 
		 {
			 d[i]=sc.nextDouble();		  	 
		 }
			 System.out.println(Arrays.toString(d));	 
			 for(int j=0;j<=d.length-1;j++) {
				 sum=sum+d[j];
			 }
			System.out.println("Sum of  the array elements : " +sum);
			System.out.println("Average of 5 numbers of array is : " +sum/5);			
	}
}
