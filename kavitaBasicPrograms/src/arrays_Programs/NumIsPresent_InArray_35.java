
package arrays_Programs;
import java.util.Scanner;
public class NumIsPresent_InArray_35 {

	public static void main(String[] args) {
		/* Assignment 35 :There is a array of numbers int data type which has  5 datatype  size 10,20,30,40,50
		Try to check if the given number 45 is present in the array or not  */
				
		int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
	
		System.out.println("Enter a num that is present in the given array or not");
		Scanner sc1=new Scanner(System.in);
		int num1=sc1.nextInt();				
		 if(num[0]==num1 || num[1]==num1 || num[2]==num1 || num[3]==num1 || num[4]==num1)
		 {
			 System.out.println("the given number is present ");	
		 }
		 else {
			 System.out.println("the given number is  not present ");	
		 }         
	}
}
