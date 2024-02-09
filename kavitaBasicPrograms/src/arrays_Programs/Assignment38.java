package arrays_Programs;
public class Assignment38 {
	public static void main(String[] args) {
		// Assignment 38 :Create a array of data type int of length 5 and in that find max and min number

		int num[]= {12,34,98,2,10};	
		int max=num[0];
		int min=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max) 
			{
				max=num[i];
			}
			if(num[i]<min)
			{
				min=num[i];
			}				
		}
		System.out.println("Maximum number is : " +max);
		System.out.println("Minmum number is  : " +min);
	}
}
