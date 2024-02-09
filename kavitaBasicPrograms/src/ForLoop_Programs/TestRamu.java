package ForLoop_Programs;

public class TestRamu {

	public static void main(String[] args) {
		String a1="My name is Ramu";
		System.out.println(a1.length());
		
		for (int i=0; i<a1.length();i=i+1)
		{
			if(a1.charAt(i) !=' ')
			{
				System.out.print(a1.charAt(i));
				//System.out.println(i);
			}
			else
			{
				System.out.println(" ");
			}
		}
	}

}
