package arrays_Programs;

import java.util.Arrays;

public class CopyOneArrayToAnotherArray {
	// copy one array value to another value by iterating
	public static void main(String[] args) {
			
		int array1[]= {45,85,74,69};
		int new_array[]= new int[array1.length];
		
		for(int i=0;i<array1.length;i++) 
		{
			new_array[i]=array1[i];			
		}
	
		System.out.println("copy one array to another new array : " +Arrays.toString(new_array));			
	}
}
