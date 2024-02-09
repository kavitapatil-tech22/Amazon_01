package collections_Prgms;

import java.util.Vector;

public class VectorPrgm4 {

	public static void main(String[] args) {
//		Remove Vector Elements
//		remove(index) - removes an element from specified position
//		removeAll() - removes all the elements
//		clear() - removes all elements. It is more efficient than removeAll()

		
		 Vector<String> animals= new Vector<>();
	        animals.add("Dog");
	        animals.add("Horse");
	        animals.add("Cat");
	        animals.add("Dog");
	        animals.add("123");
	        animals.add("null");
	        animals.add("Cat");
	        System.out.println("Initial Vector: " + animals);

	        // Using remove()
	        String element = animals.remove(1);
	        System.out.println("Removed Element: " + element);
	        System.out.println("New Vector: " + animals);

	     
	        
//	        boolean b=animals.removeAll(animals);        
//	        System.out.println(b);
	        
	        // Using clear()
	        animals.clear();	       
	        System.out.println("Vector after clear(): " + animals);
		
	}

}
