package arrays_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayValue_UsingScannerClass {

	public static void main(String[] args) {
		
		int num[]=new int[5];
		
		System.out.println("enter the array elements");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}		
		System.out.println(Arrays.toString(num));
	}
}
