package kavitaBasicPrograms;


// super most Class
class Reshwal
{
	 void Test5() {
			
		}
		static void Test6() {
			
		}
}
// super class
abstract class kavita extends Reshwal
{
	abstract void Test1();
	abstract void Test2();
	void Test3() {
		System.out.println("Test3");
	}
	static void Test4() {
		System.out.println("Test4");
		
	}
	
}

// sub class
public class Deepti_Test_AbstractCLass extends kavita
{

	public static void main(String[] args) {
		
		Deepti_Test_AbstractCLass dtc=new Deepti_Test_AbstractCLass();
		dtc.Test1();
		dtc.Test2();
		dtc.Test3();
		Test4();	

	}
	
	void Test1() {
		System.out.println("abstract method Test1");
		
	}
	void Test2() {
		System.out.println("abstract method Test2");
		
	}

}
