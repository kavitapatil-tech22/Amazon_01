package kavitaBasicPrograms;

public class MethodOverloading {
	
	void add() {
		int a=6;int sum =a+100;
		System.out.println(sum);
	}
	void add(int a) {
		int sum=a+6;		
		System.out.println(sum);
	}
	void add(int a,int b) {
		int sum =a+b;		
		System.out.println(sum);
	}
	static void add(double a,int b) {		
		double sum=a+100+b;
		System.out.println(sum);	
	}
	public static void main() {
		System.out.println("without passing parameter main method");
	}
	public static void main(int a , int b) {		
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.add();
		mo.add(10);
		mo.add(20, 30);
		add(10.20,40);	
		main();
		main(10, 10);
	}

}
