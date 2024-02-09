package stringPrograms;

import java.util.Scanner;

public class PalindromeString {
  /* Assignment 32 : check the Given string is palindrome or not */
	public static void main(String[] args) {
		String str, rev = "";
	      Scanner s = new Scanner(System.in);	 
	      System.out.println("Enter a string:");
	      str = s.nextLine();
	 
	      int strlength = str.length();
	 
	      for ( int i = strlength - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equalsIgnoreCase(rev))
	         System.out.println("'"+str+"'"+" the given string is a palindrome");
	      else
	         System.out.println("'"+str+ "'"+" the given string is not a palindrome");	     
	}
}
