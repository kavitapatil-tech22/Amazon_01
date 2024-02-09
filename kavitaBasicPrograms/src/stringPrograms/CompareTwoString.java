package stringPrograms;
import java.util.Scanner;
public class CompareTwoString {
	/* Assignment 28 :Store name in variable a and b . a variable should be in uppercase an b in lower case . compare both strings  */
	public static void main(String[] args) {
		// below two way  can compare the string 
		String a= "KAVITA";
		String b= "kavita";		
		System.out.println("first way of comparing the two string equals or not ");
		 if(a.equals(b)){
			 System.out.println("both string are equals");
		 }
		 else{
			 System.out.println("both string are not equals");
		 }
			/*
			 * boolean c=a.equals(b); System.out.println(c);
			 */
		System.out.println(" ");
		System.out.println("2nd way of comparing the two string equals or not");
		System.out.println("Enter the first name in Upper case"); 
		Scanner s1 =new Scanner(System.in); 
		String str1=s1.next();
	    System.out.println("Enter the Second name in Lower case"); 
	    Scanner s2 =new	Scanner(System.in);
	    String str2=s2.next();
	    boolean output=str1.equals(str2);
	    System.out.println("compare the both input upper case and lower case string equals or not :  "+output);	
	    s1.close();
	    s2.close();
	}
}
