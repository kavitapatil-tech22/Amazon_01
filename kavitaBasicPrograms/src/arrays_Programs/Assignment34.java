package arrays_Programs;

import java.util.Arrays;

public class Assignment34 {
	public static void main(String[] args) {
		// Assignment 34.Try to store any heterogeneous values in the array
		int num[]=new int[5];
		num[0]=1;
		num[1]=2;
		num[2]=21.4f;
		num[3]="39";
		num[4]=23;
		System.out.println(Arrays.toString(num));
		int num2[]= {23,"Kavita",9.4f,2.4};
		String num3[]= {"Santosh",453.43f,"Patil",3,878927293.4};
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));		
	}
}
