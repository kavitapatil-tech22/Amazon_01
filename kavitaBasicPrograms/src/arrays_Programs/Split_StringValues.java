package arrays_Programs;

import java.util.Arrays;

public class Split_StringValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="India is my country";		
		
		String splittedvalue[]=str.split(" ", 4);
		System.out.println(Arrays.toString(splittedvalue));
		
//		String splittedvalue1[]=str.split(",");
//		System.out.println(Arrays.toString(splittedvalue1));
	
	}

}
