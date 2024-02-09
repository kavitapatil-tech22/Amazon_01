package stringPrograms;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
	//	String str, rev = "";
	      Scanner s = new Scanner(System.in);
	      
	      System.out.println("Enter a num:");
	      int num = s.nextInt();
	      int rev=0,rem;
	      while(num!=0)
	      {
	    	 rem=num%10;
	    	rev=(rev*10)+rem;
	    	num=num/10;
	      }
	      System.out.println("reverse num : " +rev);
//	      if(num!=rev)
//	      {
//	         System.out.println("reverse num : " +rev);
//	      }
//	      else {
//	    	  System.out.println("num is not reverse : " +rev);
//	      }
	      

	}

}
