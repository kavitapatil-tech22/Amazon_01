package abstractProgram;

//grand parent class
abstract class one{
	abstract void add();
	abstract void sub();
}
//parent 
abstract class two extends one
{
	abstract void add1();
	abstract void sub1();
}
//child class
public class Abstract_Class1 extends two
{
	void add1() {
		System.out.println("add 1");
		
	}
	void sub1() {
		System.out.println("sub2");
		
	}
	void add() {
		System.out.println("add");
		
	}
	void sub() {
		System.out.println("sub");
		
	}
	public static void main(String[] args)
	{
		Abstract_Class1 ab=new Abstract_Class1();
		ab.add();
		ab.sub();
		ab.add1();
		ab.sub1();
		
	}

	

}
