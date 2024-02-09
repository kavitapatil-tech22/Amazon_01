package assignmentsPrgm;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment_50 {
  /* Assignment 50:  Create array of length 4  and take input  from scanner class of all 4 values and
   *  now confirm if the length is actually 4 and further confirm and do further actions  */	
	public static void main(String[] args) {
		int numbers[]= new int[3];
		
		Scanner sc= new Scanner(System.in);		
		System.out.println("Enter the values to the array size is 4");
		for(int i=0; i<numbers.length;i++)
		{
			numbers[i]=sc.nextInt();
		}		
		System.out.println(Arrays.toString(numbers));
		
	    assert numbers.length>=4:"Given arrays length is not 4";	    
	    System.out.println("Given Array length size is :" + numbers.length);		    
	    int age=20;
	    if(age >=18) {
	    	System.out.println("eligible to vote");
	    }
	    else {
	    	System.out.println("not eligible to vote");
	    }	    
	}
}
