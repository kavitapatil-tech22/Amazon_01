package assignmentsPrgm;
import java.util.ArrayList;
import java.util.Collections;
public class Assignment52_ArrayList1 {
	public static void main(String[] args) {
		/* Assignment 52 : Find Out the Behavioural of all Collection Classes
		Array List */		
		ArrayList<String> animals = new ArrayList<>();
	    // add elements in the arraylist
	    animals.add("Cat");
	    animals.add("Dog");
	    animals.add("Cow");
//	    animals.add(null);
//	    animals.add(null);
	    animals.add("1");
	    System.out.println("ArrayList: " + animals);

	    // get the element from the arraylist
	  //  String str = animals.get(1);
	    System.out.println("Element at index 0: " + animals.get(0));
	     System.out.println("Element at index 1: " + animals.get(1));
	      System.out.println("Element at index 2: " + animals.get(2));
	      
	     // before sorting ascending order
	      System.out.println("\n Before Sorting");
	      Collections.sort(animals);
	      System.out.println(animals);	
	      
	      // reverse order  after sorting descending order	
	      System.out.println("\n After Sorting");
	     Collections.sort(animals,Collections.reverseOrder());
	     System.out.println(animals);		
	}
}
