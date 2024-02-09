package exam4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

       String str = null;
//		try {
//		System.out.println("Enter the input Value");
//			 Scanner sc=new Scanner(System.in);
//				int num=sc.nextInt();	
//		
//				System.out.println("Enter the input Value");
//				 Scanner sc1=new Scanner(System.in);
//					 str=sc1.next();	
//
//				
//				System.out.println("values : "+str);
//				sc1.close();
//				
//				System.out.println("Enter the input Value");
//				 Scanner sc2=new Scanner(System.in);
//					 int b=sc2.nextInt();
//					 int c=b/0;
//					 System.out.println("values : "+c);
//		}	
//		catch(InputMismatchException ex) 
//		{
//			System.out.println("InputMisMatchException occured : "+ex.getMessage());
//		}
      
    	   
    	   try
           {
               if ("gfg".equals(str))
                   System.out.print("Same");
               else
                   System.out.print("Not Same");            
           }
           catch(NullPointerException e)
           {
               System.out.print("Caught NullPointerException");
           }
       
//		catch(NullPointerException ex1) {
//			System.out.println("NullPointerException occured : " +ex1.getMessage());
//		}
//		catch(ArithmeticException ex2) 
//		{
//			System.out.println("Exception occured : "+ex2.getMessage());			
//		}		
	}
}
