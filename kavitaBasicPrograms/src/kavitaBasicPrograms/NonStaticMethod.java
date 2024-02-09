package kavitaBasicPrograms;
public class NonStaticMethod {

	// date : 05/10/2023 calling non static method using object creation
	static boolean b;
	boolean b1=true;
	int age =20;
	
	//COnstructor
	NonStaticMethod()
	{	
		System.out.println("Calling COnstructor ");		
	}
	//COnstructor with parameter
	NonStaticMethod(int a,int c)
	{	
		double sum = a+c;
		System.out.println(sum);			
	}	
	//COnstructor with parameter
	NonStaticMethod(float a,float b)
	{	
		float sum = a+b;
		System.out.println(sum);			
	}
	//COnstructor with parameter
	NonStaticMethod(boolean  b)
	{	
		System.out.println(b);			
	}
	//COnstructor with parameter
	NonStaticMethod(int a,int b,int c)
	{	
		int sum = a+b+c;
		System.out.println(sum);
			
	}
	// non static
	void addition(int a,int b)
	{
		int sum= a+b;
		System.out.println("addition  " + sum);
		
	}
	// non static
	void subtract() {
		int a=20,b=30;
		int sub=b-a;
		System.out.println("substract");
		System.out.println("subtrction " +sub);
	}
	// non static
	void multiplication() {
		System.out.println("multiplication");
		
	}
	// non static
	void Division() {
		
		System.out.println("Division");
		
	}
	// static method
	static void add1()
	{
		System.out.println("static method");
	}
	public static void main(String[] args) 
	{ 
		System.out.println(b);
				
		new NonStaticMethod();		
		NonStaticMethod n=new NonStaticMethod(10,60);		
		new NonStaticMethod(2,3,4);	
		
		n.b1=false;
		
	    System.out.println(n.b1);		
		n.Division();           // non static
		n.addition(20,30);      // non static
		n.subtract();              // non static
		n.multiplication();   // non static
		add1();   // static method 
		
		

	}
	
}
