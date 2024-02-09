package accessSpecifier2;

public class Class_San1 {
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

}
