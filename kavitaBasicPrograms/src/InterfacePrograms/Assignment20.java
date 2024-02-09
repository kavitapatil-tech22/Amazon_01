package InterfacePrograms;

/* Assignment 20 : Create Interface with 2 abstract method, and abstract class with 2 abstract method and 
2 concrete method, and subclass with 2 concrete method and main method make relation with Multiple inheritance*/

interface Teacher1
{
	void manish();
	void kavita();	
}
//super class
abstract class Student1
{
	abstract void javcourse();
	abstract void Api();
	void manual() {
		System.out.println("Class - Manual non static method");
	}
	static void phython() {
		System.out.println("Class - Phython static method");
	}
}
//sub class
public class Assignment20 extends Student1 implements Teacher1
{
	void print() {
		System.out.println("sub class - print non static method");
	}
	static void dispaly() {
		System.out.println("sub class - dispaly static method");
	}
	public static void main(String[] args) {
		Assignment20 assign=new Assignment20();
		assign.manish();
		assign.kavita();
		assign.javcourse();
		assign.Api();	
		assign.manual();
		phython();		
		assign.print();
		dispaly();
	}	
	public void manish() {		
		System.out.println("Interface 1 - Teacher :  Manish");
	}	
	public void kavita() {
		System.out.println("Interface 1- Teacher :  kavita ");		
	}	
	void javcourse() {		
		System.out.println("abstract class - Student- Course :  Java");
	}	
	void Api() {		
		System.out.println("abstract class - Student- Course :  API");
	}
}
