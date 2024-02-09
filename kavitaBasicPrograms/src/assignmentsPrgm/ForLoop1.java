package assignmentsPrgm;

public class ForLoop1 {
    // Assignment 22 : run a loop infinite times using byte data type with i++ and i--
	public static void main(String[] args) {
		String str="kavita";
		System.out.println("Using Increment Operator");		
		for(byte i=1;i<3;i++) 
		{			
	      System.out.println(str + ' ' +i );    
		}
		System.out.println();
		System.out.println("Using Dercrement Operator");
		for(byte i=1;i<3;i--) 
		{			
	      System.out.println(str + ' ' +i );	   
		}		 
	}
}
