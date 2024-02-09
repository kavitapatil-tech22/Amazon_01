package kavitaBasicPrograms;

public class MultipleMain 
{
	public static void main() 
	{
		System.out.println("without passing parameter main method");
	}
	public static void main(int a) 
	{
		System.out.println("with one passing parameter main method " +a);
	}
	public static void main(int a,int b) 
	{
		System.out.println("without passing parameter main method " +a);
	}
	public static void main(String[] args)  //main method
	{
		main();
		main(90);
		main(76,87);

	}	
	
	
}
