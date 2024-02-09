package accessSpecifier1;
public class Operator {
	private static void add()
	{
		System.out.println("adding");
	}
	public void sub()
	{
		System.out.println("subtraction");
	}
	protected void mul()
	{
		System.out.println("multiplication");
	}
	/* default /package */
	void div()
	{
		System.out.println("division");
	}	
	public static void main(String[] args) {
		add();     // static method calling directly
		Operator op=new Operator();
		op.sub();
		op.mul();
		op.div();		
	}
}
