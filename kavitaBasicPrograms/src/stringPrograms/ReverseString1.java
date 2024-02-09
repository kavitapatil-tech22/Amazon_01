package stringPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
		String str="software";
		String output="";
		//char ch="";
		for(int i=str.length()-1;i>=0;i--)
		{
			 output=output+str.charAt(i);
			
		}
		 System.out.println(output);
	}

}
