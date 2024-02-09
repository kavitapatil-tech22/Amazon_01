package kavitaBasicPrograms;

public class LocalVariable_1 {
	int a;                                      // global variable
	   static double pi=3.14;         // global
	   static String name= "Kavita" ;              // global variable
	public static void main(String[] args) {
		  	    
		          int a=100;                   // global variable
		          Double pi=3.14;        //local variable
		          pi=3.14;                     // global variable
		          name = "kavi";    // global variable
		        int b=100;
		       System.out.println(b);
		         b=200;
		         System.out.println(b);
		         System.out.println(name);
		         System.out.println(pi);
		         System.out.println(a);

	}

}
