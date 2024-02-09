package collections_Prgms;

import java.util.ArrayList;

public class ArrayListPrgm2 {

	public static void main(String[] args) {
//		 ArrayList languages = new ArrayList();
//
//		    // add elements in the array list
//		    languages.add("Java");
//		    languages.add("Kotlin");
//		    languages.add("C++");
//		    languages.add(2, "kk");
//		    System.out.println("ArrayList: " + languages);
//
//		    // change the element of the array list
//		    languages.set(2, "JavaScript");		    
//		    //languages.set(1, "C#");
//		   System.out.println("Modified ArrayList: " + languages);
		
		// creating an array list
	    ArrayList<String> animals = new ArrayList<>();
	    animals.add("Cow");
	    animals.add("Cat");
	    animals.add("Dog");
	   // System.out.println("ArrayList: " + animals);

	    // iterate using for-each loop
	    System.out.println("Accessing individual elements:  ");
		
		 for (String language : animals) {
		      System.out.print(language);
		      System.out.print(", ");
		    }
		
	}

}
