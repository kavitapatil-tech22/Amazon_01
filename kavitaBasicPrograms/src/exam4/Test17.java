package exam4;

public class Test17 {

	  //fibnoci series  0 1 1 2 3  5 8 1 3
	public static void main(String args[])
	{
	int a=0;
	int b=1;
	System.out.print(a+ " ");
	System.out.print(b+ " ");
	for(int i=0;i<=10;i++)
	{
		int sum=a+b;
			a=	b;
				b=sum;
		
	System.out.print(sum+ " ");	
	}
	
	// 1:find out the even and odd num 1 to 100 without using if and else 
	// 2: print num from 1 to 100 in which num is divisible by 3 print computer if num is didvisible by 5 print mouse if num is divisble by both 3 and 5 the prtin comp and mouse print 
	
}
}