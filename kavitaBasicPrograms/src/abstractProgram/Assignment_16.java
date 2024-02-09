package abstractProgram;

//Assignment 16 : Create concrete Super most class with 2 concrete method, abstract super class with 2 abstract and 2 concrete methods,
  //subclass with 2 concrete and main method, create relationship between them

//super most class
class Super_Most_Class
{	
	 void display1() {
		System.out.println("Super most class non static method");		
	}
	static void display2() {
		System.out.println("Super most class static method");
	}
}
// abstract super class
abstract class AbstractClass1 extends Super_Most_Class
{
	abstract void add();
	abstract void sub();
	void print1() {
		System.out.println("Super class non static method");
	}
	static void print2() {
		System.out.println("Super class static method");
	}
}
//sub class
public class Assignment_16 extends AbstractClass1
{
	void learning1() {
		System.out.println("Sub class non static method");
	}
	static void learning2()	{
		System.out.println("Sub class static method");
	}
	public static void main(String[] args) {
		
		Assignment_16 assgn16=new Assignment_16();
		assgn16.display1();		     //  super most class static method
		display2();            // super most class non static m,ethod
		assgn16.add();      //   super abstract class - abstract add method, sub class of add() implements get called 
		assgn16.sub();		 //  super abstract class - abstract sub method,sub class of sub() implements get called 
		assgn16.print1();     //  super abstract class non static print method
		print2();             //  super abstract class non static method		
		assgn16.learning1();  // sub class non static method
		learning2();   // sub class static method
	}	
	//abstract method implementation
	void add() {		
		System.out.println("Abstract super class, add method implimentation");
	}
	//abstract method implementation
	void sub() {
		System.out.println("Abstract super class ,substract method implimentation");		
	}
}
