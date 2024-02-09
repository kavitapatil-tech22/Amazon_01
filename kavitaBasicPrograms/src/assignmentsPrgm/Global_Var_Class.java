package assignmentsPrgm;
public class Global_Var_Class {
	//Assignment 9: Make two variables as global a & b value of a=10 and value of b=20. Create 4 methods for addition,subtraction,
	//multiplication and Division and call each method inside main method

	public static int a=20,b=30;   // global variable	
	void addition()
	{
		 int sum = a+b;
		 System.out.println(sum);
	}
	void subtract()
	{
		 int sub = b-a;
		 System.out.println(sub);
	}
	static void multiplication()
	{
		 int multi = a*b;
		 System.out.println(multi);
	}
	static void division()
	{
		 int div = b/a;
		 System.out.println(div);
	}
	public static void main(String[] args) {
		Global_Var_Class  gv=new Global_Var_Class();
		gv.addition();
		gv.subtract();
		multiplication();
		division();
	}
}
