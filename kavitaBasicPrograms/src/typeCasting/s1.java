package typeCasting;
//upcasting Case2
class s3
{
	void one() {
		System.out.println("s3 class property can access");
	}
}
class s2 extends s3
{
	void two() {
		System.out.println("s2 class ");
	}
}
public class s1 extends s2
{
  void three() {
	  System.out.println("s1 class");
  }
	public static void main(String[] args) {
		s3 refrenceVariable= new s1();   // upcasting
		refrenceVariable.one();		
	}

}
