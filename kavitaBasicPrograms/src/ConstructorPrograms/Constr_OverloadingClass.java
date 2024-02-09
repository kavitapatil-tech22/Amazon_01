package ConstructorPrograms;

public class Constr_OverloadingClass {

	 // Date : 06/10/2023 Constructor Overloading
	Constr_OverloadingClass()
	{
		System.out.println("India");
		
	}
	
	Constr_OverloadingClass(int a)
	{
		System.out.println(a);
		
	}
	Constr_OverloadingClass(double b,int a)
	{
		double sum=b+a;
		System.out.println(sum);
		
	}
	Constr_OverloadingClass(String s)
	{
		
		System.out.println(s);
		
	}
	Constr_OverloadingClass(char ch)
	{
		
		System.out.println(ch);
		
	}
	Constr_OverloadingClass(boolean b)
	{
		
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		
		System.out.println("Hello world");
		new Constr_OverloadingClass();
		new Constr_OverloadingClass("Kavita");
		new Constr_OverloadingClass(10);
		new Constr_OverloadingClass(10.23,2);
		new Constr_OverloadingClass('F');
		new Constr_OverloadingClass(true);
		
		
	}

}
