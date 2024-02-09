package kavitaBasicPrograms;
class SupermostClas1{
	
	SupermostClas1(String str)
	{		
	     System.out.println("Supermostclass1 : constrcutor  " +  str);
	}
}
class Superclass1 extends SupermostClas1
{
	Superclass1(int i)
	{
		super("Kavita");   // here explicitly calling super() statement
		
	     System.out.println("Superclass1 : constrcutor : " +i);
	}
}

class Subclass1 extends Superclass1
{
	Subclass1()
	{
		// here is we not written super() calling statement then it is will call implicitly
		super(100);  // super() calling statement , explicitly call
		System.out.println("Subclass1 : constrcutor");
	}
}
public class SuperCallingStatement {

	public static void main(String[] args) {
		
		new Subclass1();
	}

}
