package arrays_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class SearchNumber {

	public static void main(String[] args) {
		// Assignment 35 : search the value in the given array elements
		System.out.println("Enter the array elements value");
		Scanner sc=new Scanner(System.in);
		int num[]=new int[5];
		for(int i=0;i<5;i++)
		{
			num[i]=sc.nextInt();		
		}
		System.out.println(Arrays.toString(num));
		
		System.out.println("Enter the search value");
		Scanner sc1=new Scanner(System.in);
		int search=sc1.nextInt();			
		boolean b=false;
		for(int j=0;j<num.length;j++)
		{
			if(num[j]==search) 
			{
				b=true;
				break;
			}
		}
		if(b) {
			System.out.println("Search value "+search+ "is present in the given array");
		}
		else {
			System.out.println("Search value " +search+ " is not present in the given array");
		}	
		
	}
}
