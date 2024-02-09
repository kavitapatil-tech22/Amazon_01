package abstractProgram;

abstract class t1 
{
         abstract void m1();
         static void m2() {
        	 System.out.println("static method in abstract class");
         }
          void m3() {
        	 System.out.println("non static method in abstract class");
         }
}
class c extends t1
{
   void m1()   // abstract method
   {
       System.out.println("t1 in class ");
   }
   static void c3()
   {
       System.out.println("c3 in class ");
   }
} 
public class Abstract_Class_1 
{
	public static void main(String[] args)
	{
		c c = new c();
		 c.m1();
		 t1.m2();
		 c.m3();
		 //c3();
	}

}
 
