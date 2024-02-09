package stringPrograms;

public class ReplaceStringFunc {

	public static void main(String[] args) {
		String str="Happy";
		
		String str1=str.replaceAll("pp", "");
		System.out.println(str1);
		
		String str2=str.replaceAll("app", "ubb");
		System.out.println(str2);
		
		// given string  Abcrtrtrt1234 replace all alphabets  out put should be digits only
		
		String str3="/RR Nagar-channasandra#,560098";
		String str4=str3.replaceAll("[A-Z,a-z,/,#, ,-]","");
		System.out.println(str4);
		
	}

}
