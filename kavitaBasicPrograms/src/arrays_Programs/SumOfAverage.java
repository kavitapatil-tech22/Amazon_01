package arrays_Programs;

public class SumOfAverage {

	public static void main(String[] args) {
		int s1[]= {66,77,23,86,11};
		int sum=0;
		for(int i=0;i<=s1.length-1;i++)
		{
			sum=sum+s1[i];
		}
		System.out.println(sum);
		System.out.println("Average of 5 numbers of my array is:");
		System.out.println(sum/s1.length);
		System.out.println(sum%s1.length);

	}

}
