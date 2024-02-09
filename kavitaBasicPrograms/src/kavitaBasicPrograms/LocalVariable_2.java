package kavitaBasicPrograms;

public class LocalVariable_2 {
	int a=100;                 // global var
	   static int b=100;       // global var
	static void add()
	{
	    b=200;                //global vari
	    System.out.println(b);
	}
	public static void main(String[] args) 
	{
		
		 b=300;
         System.out.println(b);
	}
		
}
