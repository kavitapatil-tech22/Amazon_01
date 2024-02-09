package collections_Prgms;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSet1 {

	public static void main(String[] args) {
			//Creating HashSet and adding elements  
        LinkedHashSet<String> Lhset=new LinkedHashSet();  
        Lhset.add("One");    
        Lhset.add("Two");    
        Lhset.add("Three");   
        Lhset.add("20");  
        Lhset.add("Four");  
        Lhset.add("Five");  
        Lhset.add("Six");  
        Lhset.add("Five"); 
        Iterator<String> i=Lhset.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
	}
}
