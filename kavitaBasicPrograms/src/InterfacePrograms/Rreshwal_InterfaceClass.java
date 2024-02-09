package InterfacePrograms;

interface kavita{
	
	void test1();
	void test2();
}

interface deepti{
	
	void test3();
}



//subclass
public class Rreshwal_InterfaceClass implements deepti,kavita
{
	public static void main(String[] args) {
				
		Rreshwal_InterfaceClass ri=new Rreshwal_InterfaceClass();
		ri.test1();
		ri.test2();
		ri.test3();
	}	
	public void test1() {
		System.out.println("test1");
		
	}
	public void test2() {
		System.out.println("test2");		
	}
	public void test3() {
		System.out.println("test3");
		
	}

}
