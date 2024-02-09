package stringPrograms;
public class ConvertingUpper_LowerCase {
	public static void main(String[] args) {
		
		String name="kavita";		
		String Name1="PATIL";		
		System.out.println("converting lowercase " + name + " to Upper case : " +name.toUpperCase());
		System.out.println("Converting Uppercase "+Name1 + " to LowerCase : " +Name1.toLowerCase());

		String Name3="Kavita Krishna Anoor";
		
		System.out.println("Length of the string is : " +Name3.length());
		
		String str1="   My Name is    Kavita Patil ";
		System.out.println("before not using trim function:"+str1);
		System.out.println("after using trim function the string :" +str1.trim());
		
		String str2="Kavita";
		System.out.println("Charcter at given index is : " + str2.charAt(4));
		System.out.println("Index of given charcter is : " + str2.indexOf('v'));
		
		System.out.println(str2.substring(2));
		System.out.println(str2.substring(2, 4));
		
		boolean b=str2.endsWith("a");
		System.out.println(b);
		System.out.println(str2.endsWith("l"));  // return type is boolean true or false
		
		boolean d=str2.contains("K");
		System.out.println("K latter is contains given string Kavita : "+d);
		System.out.println(str2.contains("K"));
		//
		String str3="Kavita";
		String str4="Patil";
		String str5=str3.concat(str4);		
		System.out.println(str5);
		
		
		
		
		
		
		
		
	}

	private static String concat(String str3, String str4) {
		// TODO Auto-generated method stub
		return null;
	}
}
