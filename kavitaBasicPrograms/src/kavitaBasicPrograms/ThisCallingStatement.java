package kavitaBasicPrograms;

public class ThisCallingStatement {
	ThisCallingStatement()
	{
		this(80.27);
		
		System.out.println("adding single value");
		
	}
	ThisCallingStatement(double d)
	{
		System.out.println(d+10);
	}
	ThisCallingStatement(int a)
	{
		this();		
		int b=5;
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //new ThisCallingStatement();
         new  ThisCallingStatement(90);
	}

}
