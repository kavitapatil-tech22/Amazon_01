package ConditionalPrograms;

public class If_Else_If_Statment_Class {

	public static void main(String[] args) {
         //Assignment 7: Based on Female and male If age is greater than 65, need to check if the gender is male or female. If male take 75% of ticket & female is free.
		int age=65; 
		char gender='F'; 
		if(age>=18)
		{
			if(age>=65)// if age is more than 65 will treating as senior citizen
			{
				System.out.println("Senior citizen based on gender price will be decided");
				
				if(gender=='M')
				{
					System.out.println("You are senior citizen male so pay 75% of fare");
				} 
				else if(gender=='F')
				{
					System.out.println("You are senior citizen female so its free");
				} 
			}
			else {
				//less then age is 65 and grater than 18 treated as adult
				if(age<=65 && age>=18) {
					if(gender=='M') {
						System.out.println("You are an adult Male pay full amount");	
					}
					else {
						System.out.println("You are an adult female so ticket is free");	
					}					
				}				
			}								
		}	
		else 		
		{
			System.out.println("You are not an adult, you can pay half fare");
		}	
	}	
}
