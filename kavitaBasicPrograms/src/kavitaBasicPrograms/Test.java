package kavitaBasicPrograms;

public class Test {

	
public static void main(String[] args)
{
		
   B b = new B();
   System.out.println(b.x); 
 
   A a = new A();
   System.out.println(a.x);
 
   A a2 = new B();
   System.out.println(a2.x);
  }
}
	
 class A 
{
		int x = 20;	
				
}		   
			
 class B extends A
 {
			   int x = 30;
			
 }


