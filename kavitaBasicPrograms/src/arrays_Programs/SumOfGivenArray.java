package arrays_Programs;

public class SumOfGivenArray {

	public static void main(String[] args) {
		// Give me sum of those elements that are present in the array
		
		int num[]= {10,20,30};
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println("sum of given array elements : "+sum);
	}

}
