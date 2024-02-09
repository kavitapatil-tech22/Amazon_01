package accessSpecifier2;

public class Test4 {
	
//	    private static void add()
//		{
//			System.out.println("Example of private static void - add method");
//		}
		public void sub()
		{
			System.out.println("Example of public void - sub method");
		}
		public static void sub1()
		{
			System.out.println("Example of public static void - sub1 method");
		}
		protected void div()
		{
			System.out.println("Example of protected void - div method");
		}
		//default
		void mul()
		{
			System.out.println("Example of default/package - mul method");
		}

}
