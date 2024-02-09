package assignmentsPrgm;

public class CallNonStaticMethod {

	public static void main(String[] args) {

     //Assignment 5: Write a Program to Create non static methods and call inside the static main() method

		CallNonStaticMethod n=new CallNonStaticMethod();
		n.Areaofcircle();
	}
	
	void Areaofcircle() {
		
		int radius=2;
        double pi = 3.142, area;
       // calculating the area of the circle
        area = pi * radius * radius;
        
        // result of the area of the circle
        System.out.println("Area of circle is : " + area);
	}

}
