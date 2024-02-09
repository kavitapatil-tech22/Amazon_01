package InterfacePrograms;

/*Assignment 18:Create Interface with 2 methods and 
abstract class with 2 Abstract method & one concrete method and one sub class with one concrete method and one main method*/

//interface 1
interface GroTechMind
{
	 void learning();
	 void Teaching();
}
//abstract class
abstract class Tetsing_Courses implements GroTechMind
{	
	abstract void Manual_courses();
	abstract void Automation_Course();	
	void Apicourse() {
		System.out.println("abstract class non static method - api course");
	}
}
//sub class
public class Test_InterfaceClass extends Tetsing_Courses
{
      void CoreJava() {
    	  System.out.println("sub class non static method - Core Java");
      }
	public static void main(String[] args) {
		Test_InterfaceClass tic=new Test_InterfaceClass();
		tic.CoreJava();	            // sub class non static method get called 
		tic.Manual_courses();   // abstract class implementation method 
		tic.Automation_Course();  // abstract class implementation method 
		tic.Apicourse();      //abstract class non static method get called
		tic.learning();        // Interface learning method implementation get called
		tic.Teaching();		   // Interface teaching method implementation get called
	}	
	public void learning() {
		 System.out.println("Interface 1 - learning Core java");		
	}	
	public void Teaching() {
		 System.out.println("Interface 1 -Teaching Core Java");		
	}	
	void Manual_courses() {
		 System.out.println("abstrat class method   - ManualCourse method implimentation");
	}	
	void Automation_Course() {
		System.out.println("abstrat class method - Automation Course method implimentation");	
	}
}
