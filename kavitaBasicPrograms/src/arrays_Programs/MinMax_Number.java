package arrays_Programs;

public class MinMax_Number {

	public static void main(String[] args) {
        int numbers[]= {24,29,56,34,48};
		
		int max=numbers[0];
		int min=numbers[0];
		
		for(int i=0; i<5; i++)
		{
		   if(numbers[i]>max)
		   {
			max=numbers[i];
		   }
		   if(numbers[i]<min)
		   {
			min=numbers[i];
		   }
		}		
		System.out.println("Maiximum number from the array is : "+max);
		System.out.println("Minimum number from the array is : "+min);
	}

}
