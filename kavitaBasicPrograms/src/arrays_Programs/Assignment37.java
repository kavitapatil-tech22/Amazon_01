package arrays_Programs;
import java.util.Arrays;
import java.util.Scanner;
public class Assignment37 {
	
	public static void main(String[] args) {
		// Assignment 37 : Get the 2 arrays from the scanner class and check if both are equal or not
		int num[]=new int[4];
		int num1[]= new int[4];	
		
		System.out.println("Enter the 1st array elements");
		Scanner sc1=new Scanner(System.in);				
		for(int i=0;i<num.length;i++) {
		    num[i]=sc1.nextInt();
		}
       System.out.println(Arrays.toString(num));     
       System.out.println("Enter the 2nd array elements");
       Scanner sc2=new Scanner(System.in);       
       for(int i=0;i<num1.length;i++){
    	  num1[i]=sc2.nextInt();   
        }
		System.out.println(Arrays.toString(num1));		
		if(Arrays.equals(num, num1)) {
			System.out.println("both arrays elements are equal");
		}
		else {
			System.out.println("both arrays elements are not equal");
		}
		sc1.close();
		sc2.close();
	}
}
