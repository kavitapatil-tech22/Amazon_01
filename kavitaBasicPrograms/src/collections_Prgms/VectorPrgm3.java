package collections_Prgms;

import java.util.Iterator;
import java.util.Vector;

public class VectorPrgm3 {

	public static void main(String[] args) {
//		Access Vector Elements
//		get(index) - returns an element specified by the index
//		iterator() - returns an iterator object to sequentially access vector elements

		Vector animals= new Vector();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
        animals.add("123");
        animals.add("null");
        animals.add("Cat");

        // Using get()
       // String element = animals.get(2);
        //System.out.println("Element at index 2: " + element);
              
        System.out.println(animals.get(2));
      
        // Using iterator()
        Iterator a = animals.iterator();
        System.out.print("Vector list: ");
      //  System.out.println(a.hasNext());
       // System.out.println(a.next());
       // System.out.println(a.next());
        
//        for(String str:animals) 
//        {
//        	 System.out.print(a.next());
//        	 System.out.print(", ");
//        }
//        
        
        while(a.hasNext())
        {
            System.out.print(a.next());
            System.out.print(", ");
        }
		
		
		
	}

}
