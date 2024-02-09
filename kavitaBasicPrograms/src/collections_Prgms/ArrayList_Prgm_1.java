package collections_Prgms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayList_Prgm_1 {
	public static void main(String[] args) {
		/* it indexing manner
		it is accepting heterogeneous elements
		dynamic nature
		it accepts duplicates
		 it allows null  */
//		ArrayList list1=new ArrayList();
//		list1.add(700);
//		list1.add(900);
//		list1.add(65);
//		list1.add(432);
//		list1.add(43);
//		list1.add(43);
//		list1.add("Kavita");
//		list1.add("Krishna");
//		list1.add("Anoor");
//		list1.add(85.65);
//		list1.add(121);
//		list1.add(null);  
//		list1.add(null);  // null is not keyword
//		System.out.println(list1);		
		//// printing the unsorted ArrayList   
		//System.out.println("Before Sorting: "+ list1);   
		//// Sorting ArrayList in ascending Order   
		//Collections.sort(list1);   
		//// printing the sorted ArrayList   
//		System.out.println("After Sorting: "+ list1);   
		//Sorting ArrayList in descending Order 
//		Collections.sort(list1, Collections.reverseOrder());
	
		       // duplicates work
				// indexing work
				// sorting work
				// null work
				//size work
				// heterogenous work
		
		
		
		 ArrayList<String> animals = new ArrayList<>();
		    // add elements in the arraylist
		    animals.add("Cat");
		    animals.add("Dog");
		    animals.add("Cow");
		    animals.add(null);
		    animals.add("1");
		    System.out.println("ArrayList: " + animals);

		    // get the element from the arraylist
		  //  String str = animals.get(1);
		    System.out.println("Element at index 0: " + animals.get(0));
		     System.out.println("Element at index 1: " + animals.get(1));
		      System.out.println("Element at index 2: " + animals.get(2));
		      
		     // before sorting ascending order
		      Collections.sort(animals);
		      System.out.println(animals);	
		      
		      // reverse order  after sorting descending order		      
		     Collections.sort(animals,Collections.reverseOrder());
		     System.out.println(animals);		     		     
	}
}
