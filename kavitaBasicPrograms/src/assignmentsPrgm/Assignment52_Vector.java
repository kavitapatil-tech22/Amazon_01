package assignmentsPrgm;
import java.util.Collections;
import java.util.Vector;
public class Assignment52_Vector {
//	add(element) - adds an element to vectors
//	add(index, element) - adds an element to the specified position
//	addAll(vector) - adds all elements of a vector to another vector
	public static void main(String[] args) {
		
		Vector mammals= new Vector();
        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add("1");
        mammals.add("2");
        mammals.add("Dog");
        //mammals.add(null);

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);
        // Using addAll()
        Vector animals = new Vector();
        animals.add("Crocodile");

        animals.addAll(mammals);
             
        System.out.println("animals   Vector: " + animals);
        System.out.println("mammals Vector: " + mammals);
              
	     // before sorting ascending order
	      System.out.println("Before  Sorting");
	      Collections.sort(animals);
	      System.out.println(animals);			      
	      // reverse order  after sorting descending order	
	      System.out.println("After Sorting in descending ordre");
	     Collections.sort(animals,Collections.reverseOrder());
	     System.out.println(animals);	
	}
}
