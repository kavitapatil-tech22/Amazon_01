package typeCasting;
class Test3 
{
	void one() {		
		System.out.println("one");
	}
}
class Test2 extends Test3
{
	void two() {
		System.out.println("two");
	}	
}
public class Test1 extends Test2
{
   void three() {
	   System.out.println("three");
   }
	public static void main(String[] args) {
		//Test1 t1=new Test1();
		
		Test3 t3=new Test1();    // upcasting
		t3.one();
		
		//Test3 t3=new Test3();
				
		Test1 t1=(Test1)t3;     //downcasting
		t1.one();
		t1.two();
		t1.three();		
	   // t1.four();               //
		
//		Test2 t2=new Test1();     
//		t2.one();
//		t2.two();	
	}
}
