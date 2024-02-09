package assignmentsPrgm;
import java.util.Collections;
import java.util.LinkedList;
public class Assignment52_LinkedlIst {
	public static void main(String[] args) {		
		 LinkedList<String> animals = new LinkedList<>();
		    // add elements in the Linkedlist
		    animals.add("Cat");
		    animals.add("Dog");
		    animals.add("Cow");
//		    animals.add(2);
//		    animals.add(3);
//		    animals.add(4);
		   // animals.add(null);
		    animals.add("1");
		    System.out.println("LinkedList: " + animals);
		    // get the element from the Linkedlist
		  //  String str = animals.get(1);
		    System.out.println("Element at index 0: " + animals.get(0));
		     System.out.println("Element at index 1: " + animals.get(1));
		      System.out.println("Element at index 2: " + animals.get(2));
		      
		     // before sorting ascending order
		      System.out.println("Before Sorting");
		      Collections.sort(animals);
		      System.out.println(animals);			      
		      // reverse order  after sorting descending order	
		      System.out.println("After Sorting in descending ordre");
		     Collections.sort(animals,Collections.reverseOrder());
		     System.out.println(animals);	
	}
}
