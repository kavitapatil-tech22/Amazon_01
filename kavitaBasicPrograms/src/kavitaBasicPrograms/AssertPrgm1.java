package kavitaBasicPrograms;

public class AssertPrgm1 {
	/* Assignment 51: Check if age of a person is greater than 18 with assert keyword only 
	if age is greater than 18 write if and else  */ 
	public static void main(String[] args) {
		String name="Kavita";
		int age=8;
		try{
		//assert name.length()>7;   // 1st way
		//System.out.println(name.concat(" anoor"));
		
		  assert name.length()>5:"your name has less charcter";       // 2nd way
		
		System.out.println(name.concat(" anoor"));
		
		  assert age>18:"your age is " +"'"+age+"'"+" ,less than 18 so not elgible to vote";
		  //System.out.println(age);
		  
		 // System.out.println("Your age is "+"'"+age+"'"+" elgiable to vote");
		}
		catch(AssertionError ex) 
		{
			System.out.println(ex.getMessage());
		}			
	}
}
