package stringPrograms;
import java.util.Scanner;

public class Assignment35 {

	public static void main(String[] args) {
		/* Assignment 35 :There is a array of numbers int data type which has  5 datatype  size 10,20,30,40,50
		Try to check if the given number 45 is present in the array or not  */
				
		int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		int check=45;
		
		
			if(check==num[3])
			{
				System.out.println("the given number is present ");				
			}
			else
			{
				System.out.println("the given number is not present ");	
			}					
	}
}
