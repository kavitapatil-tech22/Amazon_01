package kavitaBasicPrograms;

//super class
class SuperClass12{
	
	void test1() {
		System.out.println("test1");
	}
	static void test2() {
		System.out.println("test2");
	}
	void Test6() {
		System.out.println("Kavita");	
	}
}

//sub class
public class TestSavita extends SuperClass12
{
	void Test6() {
		System.out.println("Savita");	
		//super.Test6();
	}
	
	void test3() {
		System.out.println("test3");
	}
	static void test4() {
		System.out.println("test4");
	}

	void test5() {
		System.out.println("test5");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            TestSavita ts=new TestSavita();
            ts.test3();
            ts.test1();
            ts.test5();
           test2();
            test4();
            ts.Test6();
	}
	
	

}
