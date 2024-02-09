package accessSpecifier1;

public class Class_Kavita1 {
	
	public static void main(String[] args) 
	{
		Class_Kavita2 ckavita2=new Class_Kavita2();
		//ckavita2.add();   // it is private method of Class_Kavita2  it is out of scope
		ckavita2.sub();     // public
		ckavita2.mul();     // default or package
		ckavita2.div();     //protected
		
	}

}
