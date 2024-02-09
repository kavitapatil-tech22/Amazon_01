package exam4;

import java.util.Scanner;

public class Question3 {
  int a=20;
  int b=30;
	public static void main(String[] args) {
		
		
		System.out.println("Enter the input Value");
		 Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();	
			
			
			System.out.println("Enter the input Value");
			 Scanner sc1=new Scanner(System.in);
				int num2=sc.nextInt();	
				
				System.out.println("Enter the input Value");
				 Scanner sc2=new Scanner(System.in);
					int num3=sc.nextInt();	
			
					if(num1>num2)
			    if(num1>num3)
			    	System.out.println("greates number"+num1);
					
					if(num2>num1)
					    if(num2>num3)
					    	System.out.println("greates number"+num2);
					
					if(num3>num1)
					    if(num3>num2)
					    	System.out.println("greates number"+num3);

	}

}
