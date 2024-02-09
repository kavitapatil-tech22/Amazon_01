package assignmentsPrgm;
/*  In the multilevel inheritance of 4 classes downcast from 3 to 2 class Classes : 4 3 2 1 */
class Class23{
		void Winner4(){
			System.out.println("winner 4");
		}
}
class Class19 extends Class23 {
		void Winner3(){
			System.out.println("winner 3");
		}
}
class Class11 extends Class19
{
		void Winner2(){
			System.out.println("winner 2");
		}
}
public class Assignment48 extends Class11
{
    void Winner1(){
		System.out.println("winner 1");
	}
   public static void main(String[] args) {
	     Class19 c19= new Class11() ; //upcasting
	     c19.Winner3();
	     c19.Winner4();
		 Class11 w2 = (Class11) c19; // downcasting
		 w2.Winner2();
		 w2.Winner3();
		 w2.Winner4();
	}
}
