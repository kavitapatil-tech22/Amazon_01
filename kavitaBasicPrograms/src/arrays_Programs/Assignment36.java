package arrays_Programs;
public class Assignment36 {
  public static void main(String[] args) 
  {
	/* Assignment 36 : Develop a Java program to generate an array of size 5, containing a mixture of positive and negative numbers, 
		and compute the sum of all the numbers in the array. */

	  int num[] = {5,-5,10,-2};
		int sum=0;
		for (int i=0;i<=num.length-1;i++) 
		{
			sum=sum+num[i];	
		}
		System.out.println("Sum of the positive & nagative numbers in the given array value is  : " +sum);	  
  }

}
