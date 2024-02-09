package stringPrograms;

public class ReplaceAlpha_CapitalLatters {
 /* Assignment 30 :remove all alphabet that is in capital Letters Example: ABCDEFG1234 [A-Z]   */
	public static void main(String[] args) {
		
		String input="ABCDEFG1234";
		
		 String result1="";
		 String result2="";
		 
		 System.out.println("Replacing all alphabets in the given string");
		 result1 = input.replaceAll("[A-Z]", "");
		 		
		 System.out.println(result1);
		 
		 System.out.println("Replacing all digits in the given string ");
		 result2 = input.replaceAll("[0-9]", "");
		 System.out.println(result2);		 
  }
	
}