package arrays_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class CompareTwoArray {
	public static void main(String[] args) {
		/*Assignment  37 :Get the two array from scanner class and check if both of them are equal */
		
		int num[]=new int[4];
		int num1[]=new int[4];
		
		System.out.println("Enter the first array elements");
		Scanner sc1=new Scanner(System.in);		
		for(int i=0;i<num.length;i++) 
		{
			num[i]=sc1.nextInt();
		}
		System.out.println(Arrays.toString(num));
		
		System.out.println("Enter the second array elements");
		Scanner sc2=new Scanner(System.in);		
		for(int i=0;i<num1.length;i++) 
		{
			num1[i]=sc2.nextInt();
		}	
	//	int num2[]= {-12;
		System.out.println(Arrays.toString(num1));
		boolean b=Arrays.equals(num, num1);
		if(b==true)
		{
		System.out.println("both the array elements are equal : "+b);
		}
		else {
			System.out.println("both the array elements are not equal : "+b);
		}	
	}
}
