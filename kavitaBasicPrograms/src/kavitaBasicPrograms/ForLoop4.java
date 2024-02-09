package kavitaBasicPrograms;

public class ForLoop4 {

	
	int age;
	String name;
	double salary;
	void add(int age,String name,double salary)
	{
		this.age=age;
		System.out.println("Manish");
	}
	public static void main(String[] args) {
		ForLoop4 fl4=new ForLoop4();
		fl4.add(23,"Kavita", 2300.89);
		System.out.println(fl4.age);
		System.out.println(fl4.name);
		System.out.println(fl4.salary);
		
	}

}
