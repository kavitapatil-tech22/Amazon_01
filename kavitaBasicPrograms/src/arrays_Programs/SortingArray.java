package arrays_Programs;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		// given array is sorted in the ascending and descending order
		
		Integer num[]= { 12,7,25,17,24 };
		 //Ascending order
	    Arrays.sort(num);
	    System.out.println("Ascending Order : " + Arrays.toString(num));
	    
	    // descending order			    
	    Arrays.sort(num,Collections.reverseOrder());
	    System.out.println("descending Order : " + Arrays.toString(num));
	}

}
