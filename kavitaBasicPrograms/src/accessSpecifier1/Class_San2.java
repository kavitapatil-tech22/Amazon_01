package accessSpecifier1;

import accessSpecifier2.Class_San1;

public class Class_San2 {

	public static void main(String[] args) {
		
		Class_San1 csan1=new Class_San1();
		csan1.sub();   // only public method can access from  outside the package (package name as accessSpecifier2)
		
		
		
	}

}
