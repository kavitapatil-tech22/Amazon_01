package assignmentsPrgm;

import java.util.Scanner;

public class Assignment_54 {
   /*  Assignment 54 : Date: 17/01/2024
  print num from 1 to 100 in which num is divisible by 3 print computer if num is didvisible by 5 print mouse
  if num is divisble by both 3 and 5 the print computer and mouse print   */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);        
	       System.out.print("Enter the max number: ");
	       int num = sc.nextInt();
	       //System.out.print("\n\nDivisible by 3  : ");
	      // int n=3;
	       for(int i=0;i<num;i++) 	       
	       {
	    	  if(i%3==0) 	    	  
	    	  {
	    		   System.out.print("\n Computer");
	    	  }	      
	    	  if(i%5==0) 
	    	  {
	    		  System.out.print("\n Mouse");
	    	  }
	    	  if(i%3==0 && i%5==0)	    	   
	    	  {
	    		   System.out.print("\n Computer" + ", " +  "mouse");
	    		  // System.out.print("Mouse");
	    	  }	    	   	    	   
	       }	       

	}

}
