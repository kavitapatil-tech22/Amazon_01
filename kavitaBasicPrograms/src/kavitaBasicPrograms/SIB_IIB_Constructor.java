package kavitaBasicPrograms;
public class SIB_IIB_Constructor {
	

	
	//constructor
	SIB_IIB_Constructor(){
		System.out.println("Constructor 1");
	}
	//Constructor
	SIB_IIB_Constructor(int a){
		int b=a;
		System.out.println("Constructor 2 : " + b);
	}
	//IIB
	{
		
		System.out.println("IIB 1");
	}
	//IIB
	{
		System.out.println("IIB 2");
	}
	//SIB
	static  {
		
		System.out.println("SIB 1 ");
	}
	//SIB
		static  {
			
			System.out.println("SIB 2 ");
		}
	public static void main(String[] args) {
		//System.out.println("main method");	
				
		new SIB_IIB_Constructor();
		new SIB_IIB_Constructor(10);	
	}
}
