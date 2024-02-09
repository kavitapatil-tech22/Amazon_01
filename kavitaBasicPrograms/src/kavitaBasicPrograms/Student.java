package kavitaBasicPrograms;

/* Assignment 19 : using interface to achieve multiple level inheritance
 create two interface and one subclass with concrete methods
*/
//interface 1
interface Mentor
{
	void doubtsolving();
	void crosskthelper();	
}
//interface 2
interface Teacher
{
	void teaching();
	void motivation();
}
//sub class
public class Student implements Mentor,Teacher
{
	void print() {
		System.out.println("sub class - print method");
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.doubtsolving();      // Interface 1 - method implementation get called
		st.crosskthelper();    //  Interface 1 - method implementation get called
		st.teaching();         // Interface 2 - method implementation get called
		st.motivation();       // Interface 2 - method implementation get called 
		st.print();
	}	
	public void teaching() {
		System.out.println("Interafce 2 - teaching");		
	}	
	public void motivation() {		
		System.out.println("Interface 2 - Motivation");
	}	
	public void doubtsolving() {
		System.out.println("Interface 1 -doubt solving");		
	}	
	public void crosskthelper() {
		System.out.println("Interface 1 -doubt solving");			
	}
}
