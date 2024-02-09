package arrays_Programs;

import java.util.Arrays;

public class ReverseElements {

	public static void main(String[] args) {
		// Reverse the elements in the given array

		int num[]= {10,20,45,76,98};
		
		int rev[]=new int[num.length];
		
		for(int i=num.length-1,k=0;i>=0;i--) 
		{
			rev[k]=num[i];
			k++;
		}
		System.out.println("reverse of the given array elements : " +Arrays.toString(rev));	
	}
}
