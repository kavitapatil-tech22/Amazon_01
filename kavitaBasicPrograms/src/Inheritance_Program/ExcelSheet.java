package Inheritance_Program;

// Assignment 14 : Create a package with 3 classes, in main method try to extend both classes. It gives compilation error.

public class ExcelSheet extends TestCase4,TestCase3
{

	public static void main(String[] args)
	{
		
		TestCase4 tc4=new TestCase4();
		
		tc4.print3();   // super class TestCase3 non static print method
		tc4.print4();  // sub class Testcase4 non static print method
		
		
	}

}
