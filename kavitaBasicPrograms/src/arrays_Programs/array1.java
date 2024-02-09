package arrays_Programs;

import java.util.Arrays;
import java.util.Collections;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer rollno[]= {12,34,98,56};
      
      Arrays.sort(rollno);
      System.out.println("Desceding order :"+Arrays.toString(rollno));
      
      // descending order
      Arrays.sort(rollno,Collections.reverseOrder());
      System.out.println("Desceding order :" + Arrays.toString(rollno));
      
//      
//      // checking for each loop
//      for(int d:rollno) {
//    	  System.out.print(d);
//    	  System.out.print(", ");
//      }
//      
	}

}
