package stringPrograms;

public class ReverseString_Vertically {
  /*  Assignment 29: Input is "world".It should be printed  vertically and should appear as dlrow (Vertically) */
	
	public static void main(String[] args) {
		
		String input = "World";
		 char ch=0;
		for(int i=input.length()-1;i>=0;i--)
			{
			  ch=input.charAt(i);			
			//System.out.println(ch);
				System.out.print(ch);
		}
	
	}

}
