package stringPrograms;

public class StringFunct1 {

	public static void main(String[] args) {
		String str="World";
		String str1="world";
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		String c="";
		System.out.println(c.isEmpty());  // returns true only if length is zero
		
        // repeat()   finction comes from java 11
        System.out.println(str.concat(" ").repeat(3));
        
        // split function
       // String str2=str.split();
        
        
	}

}
