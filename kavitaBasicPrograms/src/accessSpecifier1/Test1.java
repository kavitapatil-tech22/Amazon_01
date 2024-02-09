package accessSpecifier1;

import accessSpecifier2.Test4;

public class Test1 extends Test4
{

	public static void main(String[] args) {
		
		
		Test4 t=new Test4();
		t.sub();
		//t.sub1();// not work
		
		Test1 t1 =new Test1();
		sub1();
		t1.sub();
		t1.div();
		//t1.mul();
	}
}
