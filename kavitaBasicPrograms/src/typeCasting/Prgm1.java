package typeCasting;

public class Prgm1 {

	public static void main(String[] args) {
		// converting double to int
		
		double d=85.53;
		int convertedint=(int)d;            // narrowing
		int convertedint1=(int)90.67;
		System.out.println(convertedint);
		System.out.println(convertedint1);
		
		//implicit
		//converting int to double
		int salary=10000;		
		double con_sal= salary;
		System.out.println(con_sal);  // implicit way // wideining
		
		double con_sal1=(double) salary;  // implict way
		System.out.println(con_sal1); 
		
		// lets convert byte into int
		
		byte a1=100;
		a1=120;
		 int a2= 876;
		  System.out.println(a2);
		  
		//  assignment 1: try convert int num into byte
         //  2: try to convert long to int  
		  // 3: 
		  
	}

}
