package stringPrograms;

public class SeparateString {
 
	 /* Assignment 26 :To print each word in a string separately using substring */
	public static void main(String[] args) {
		String Str = new String("My Name is Kavita Anoor");
		 
        // using substring() to extract substring

        System.out.println("The extracted substring  is : ");
        System.out.println(Str.substring(0, 2));
        System.out.println(Str.substring(3, 7));
        System.out.println(Str.substring(8, 10));
        System.out.println(Str.substring(11, 17));
        System.out.println(Str.substring(18, 23));

	}

}
