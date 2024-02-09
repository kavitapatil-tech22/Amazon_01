package kavitaBasicPrograms;

public class Local_Variable 
{
	public static int a=20;   // global variable	
	 void add()
	{
		 int a=10;  // local variable
		 System.out.println(a); 
		//System.out.println(this.a);	 			 
		 int a1=86;
		 System.out.println(a1);
	}
	  
	public static void main(String[] args) 
	{
		String name="Kavita";    // local variable 		
		System.out.println(name);
		Local_Variable lv=new Local_Variable();		
		lv.add();
		Local_Variable.a=30;
				
	}	
	
}
