package collections_Prgms;

import java.util.ArrayList;

public class ArrayListPrgm3 {

	public static void main(String[] args) {
		  ArrayList animals = new ArrayList();

		    // add elements in the array list
		    animals.add("Dog");
		    animals.add("Cat");
		    animals.add("Horse");
		    System.out.println("ArrayList: " + animals);

		    // remove element from index 2
		   // String str =animals.remove(2);
		    System.out.println("before ArrayList: " + animals);
		    
		    System.out.println("Removed Element: " + animals.remove(2));
		    
		    System.out.println("After removing Updated ArrayList: " + animals);
	}

}
