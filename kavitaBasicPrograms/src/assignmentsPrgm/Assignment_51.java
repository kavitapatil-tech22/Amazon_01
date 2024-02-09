package assignmentsPrgm;

public class Assignment_51 {

	public static void main(String[] args) {
		/* Assignment 51: Check if age of a person is greater than 18 with assert keyword only 
		if person age is greater than or equal to 18 then print message eligible to vote  */ 
		String name="Kavita";
		int age=10;
		try
		{			
		  //assert name.length()>7;   // 1st way
		  //System.out.println(name.concat(" anoor"));
		
		  assert name.length()>5:"your name has less charcter";       // 2nd way
		
		  System.out.println(name.concat(" anoor"));
		
		  assert age>=18:"your age is " +"'"+age+"'"+" ,less than 18 so not elgible to vote";
 
		  System.out.println("Your age is "+"'"+age+"'"+" elgiable to vote");
		}
		catch(AssertionError ex) 
		{
			System.out.println(ex.getMessage());
		}					
	}
}
