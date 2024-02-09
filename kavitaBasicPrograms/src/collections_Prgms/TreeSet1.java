package collections_Prgms;
import java.util.*;
public class TreeSet1 {
	public static void main(String[] args) 
	{
		TreeSet<String> tset = new TreeSet<>();

        // Using the add() method
		tset.add("12");
		tset.add("13");
		tset.add("19");
		tset.add("Kavita");
		tset.add(null);    // null not allowed
		tset.add("Patil");
        System.out.println("TreeSet: " + tset);

        TreeSet<String> tsetlist = new TreeSet<>();
        tsetlist.add("1000");
        System.out.println("");

        // Using the addAll() method
        tsetlist.addAll(tset);
        System.out.println("New TreeSet: " + tsetlist);
        
        tsetlist.add("2000");
        System.out.println("");
        System.out.println("New TreeSet: " + tsetlist);
	}
}
