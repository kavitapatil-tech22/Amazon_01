package exam4;
import java.util.Scanner;
public class PrintNumDivisibleBy3And5 {
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);        
	       System.out.print("Enter the max number: ");
	       int num = s.nextInt();
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
