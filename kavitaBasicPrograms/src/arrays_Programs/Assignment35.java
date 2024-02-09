package arrays_Programs;
import java.util.Scanner;

public class Assignment35 {

	public static void main(String[] args) {
		/* Assignment 35 :There is a array of numbers int data type which has  5 datatype  size 10,20,30,40,50
		Try to check if the given number 45 is present in the array or not  */
				
		int num[]=new int[5];
		System.out.println("enter a 5 numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++) 
		{
		 num[i]=sc.nextInt();
		
		}
	
		System.out.println("enter a num that is present in the given array or not");
		Scanner sc1=new Scanner(System.in);
		int num1=sc1.nextInt();
		//boolean count=false;
		for(int i=0;i<num.length;i++)
		{	
			
			   if(num1==num[i])
			   {
			    	System.out.println("the given number is present ");	
			    	
			    	
			   }
		//	if(count=false)
//			{
//				
//				System.out.println("the given number is not present "+num1);
//			}
//			else
//			{
//				System.out.println("the given number is not present "+num1);	
//				break;
//			}
			
			
	   }	
		
		
	}
}
