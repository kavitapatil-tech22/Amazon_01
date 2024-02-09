package collections_Prgms;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet1 {
	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add(80);
		h1.add(80);
		h1.add(30);
		h1.add(50);
		h1.add(50);
		h1.add("Kavita");
		h1.add(40);
		h1.add("");
		h1.add(20);
		h1.add(null);
		h1.add(null);
		h1.add("Anoor");		
	//	System.out.println(h1.size());
		 Iterator<Object> hashset1 = h1.iterator();
	//	 vishal.next();
		 while(hashset1.hasNext())
			 
		 System.out.println(hashset1.next());
		//Collections.sort(h1);	
	}
}
