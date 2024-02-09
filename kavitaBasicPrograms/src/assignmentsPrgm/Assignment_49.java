package assignmentsPrgm;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_49 {

	public static void main(String[] args) {
		// Assignment 49:Create array of length 4 and before doing further activities confirm if the length is == 4
		
        int numbers[]= new int[4];
		
		Scanner sc= new Scanner(System.in);		
		System.out.println("Enter the values to the array size is 4");
		for(int i=0; i<numbers.length;i++)
		{
			numbers[i]=sc.nextInt();
		}		
		System.out.println(Arrays.toString(numbers));
		
	    assert numbers.length==4:"Given arrays length is not 4";
	    
	    System.out.println("Given Array length size is :" + numbers.length);	
	    
	}
}
