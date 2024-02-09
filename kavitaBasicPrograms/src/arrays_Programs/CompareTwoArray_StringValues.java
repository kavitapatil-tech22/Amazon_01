package arrays_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class CompareTwoArray_StringValues {

	public static void main(String[] args) {
		// Get the two array of string values from scanner class and check if both of them are equal
		String str[]= {"Kavita","Krishna","Anoor"};
		String str1[]= {"Kavita","Santosh","Patil"};
		
		boolean output=Arrays.equals(str, str1);		
		System.out.println(output);
		// using scanner class
		System.out.println("Enter the 1st array values");
		Scanner sc1=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			str[i]=sc1.next();
		}

		System.out.println(Arrays.toString(str));
		System.out.println("Enter the 2nd array values");
		Scanner sc2=new Scanner(System.in);
		
		for(int i=0;i<str1.length;i++)
		{
			str1[i]=sc2.next();
		}
		System.out.println(Arrays.toString(str1));
		boolean b=Arrays.equals(str, str1);
		if(b==true) {
			System.out.println("both the arrays are equals");
		}
		else {
			System.out.println("both the arrays are not equals");
		}			
	}
}
