package exam4;
class test3 
{
	 public void m1() {
	        System.out.println("A's m1 method");
	    }

	    public void m2() {
	        System.out.println("A's m2 method");
	    }
	    
}	

public class B extends test3 {
    
	    public void m1() {
	        System.out.println("B's overridden m1 method");
	    }

//	    public void m3() {
//	        System.out.println("B's m3 method");
//	    }

	    public void m4() {
	        System.out.println("B's m4 method");
	    }
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
		test3 ob = new B();
	        ob.m1(); 
	        // ob.m2();
	        //ob.m3(); 
	        // ob.m4(); 
		}
	    
	    
	}

	

